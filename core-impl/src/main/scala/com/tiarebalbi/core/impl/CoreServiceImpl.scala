package com.tiarebalbi.core.impl

import akka.NotUsed
import com.lightbend.lagom.scaladsl.api.ServiceCall
import com.tiarebalbi.core.api.CoreService

import scala.concurrent.Future

class CoreServiceImpl extends CoreService {

  override def currentVersion(): ServiceCall[NotUsed, String] = ServiceCall { _ =>
    // Sample logic
    Future.successful(util.Properties.versionString)
  }
}
