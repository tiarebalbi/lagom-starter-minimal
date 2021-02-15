package com.tiarebalbi.core.api

import akka.NotUsed
import com.lightbend.lagom.scaladsl.api.{Descriptor, Service, ServiceCall}

/**
 * Default Core Service
 *
 * @version 1.0.0
 */
trait CoreService extends Service {

  override final def descriptor: Descriptor = {
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
