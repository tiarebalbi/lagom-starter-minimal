package com.tiarebalbi.core.impl

import com.lightbend.lagom.scaladsl.server.LocalServiceLocator
import com.lightbend.lagom.scaladsl.testkit.ServiceTest
import com.tiarebalbi.core.api.CoreService
import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AsyncWordSpec

class CoreServiceSpec extends AsyncWordSpec with Matchers {
  "The CoreService" should {
    "retrieve api version" in ServiceTest.withServer(ServiceTest.defaultSetup) { ctx =>
      new CoreApplication(ctx) with LocalServiceLocator
    } { server =>
      val client = server.serviceClient.implement[CoreService]

      client.currentVersion().invoke().map { response =>
        response should ===(util.Properties.versionString)
      }
    }
  }
}
