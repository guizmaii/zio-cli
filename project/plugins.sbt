addSbtPlugin("ch.epfl.scala"                     % "sbt-bloop"                 % "1.4.13")
addSbtPlugin("ch.epfl.scala"                     % "sbt-scalafix"              % "0.10.3")
addSbtPlugin("com.eed3si9n"                      % "sbt-buildinfo"             % "0.11.0")
addSbtPlugin("com.github.sbt"                    % "sbt-unidoc"                % "0.5.0")
addSbtPlugin("com.github.sbt"                    % "sbt-ci-release"            % "1.5.10")
addSbtPlugin("com.github.cb372"                  % "sbt-explicit-dependencies" % "0.2.16")
addSbtPlugin("com.thoughtworks.sbt-api-mappings" % "sbt-api-mappings"          % "3.0.0")
addSbtPlugin("org.portable-scala"                % "sbt-scalajs-crossproject"  % "1.1.0")
addSbtPlugin("org.scala-js"                      % "sbt-scalajs"               % "1.10.0")
addSbtPlugin("org.scalameta"                     % "sbt-mdoc"                  % "2.3.2")
addSbtPlugin("org.scalameta"                     % "sbt-scalafmt"              % "2.4.3")
addSbtPlugin("org.scoverage"                     % "sbt-scoverage"             % "1.6.1")
addSbtPlugin("pl.project13.scala"                % "sbt-jmh"                   % "0.4.3")
addSbtPlugin("org.scalameta"                     % "sbt-native-image"          % "0.3.1")
addSbtPlugin("dev.zio"                           % "zio-sbt-website"           % "0.3.6")

resolvers += Resolver.sonatypeRepo("public")
