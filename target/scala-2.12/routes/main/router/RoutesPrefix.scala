// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/roychang/Project/test/play-test/dbtest/conf/routes
// @DATE:Thu Apr 25 13:09:29 JST 2019


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
