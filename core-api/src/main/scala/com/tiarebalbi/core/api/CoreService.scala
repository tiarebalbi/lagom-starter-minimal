package com.tiarebalbi.core.api

import akka.NotUsed
import com.lightbend.lagom.scaladsl.api.Descriptor
import com.lightbend.lagom.scaladsl.api.Service
import com.lightbend.lagom.scaladsl.api.ServiceCall

/**
 * Default Core Service
 *
 * @version 1.0.0
 */
trait CoreService extends Service {

  final override def descriptor: Descriptor = {
    import Service._

    // @formatter:off
    named("core")
      .withCalls(
        pathCall("/api/version", currentVersion _)
      )
      .withAutoAcl(true)
    // @formatter:on
  }

  def currentVersion(): ServiceCall[NotUsed, String]

}
