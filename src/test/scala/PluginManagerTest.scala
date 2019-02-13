import org.scalatest.FunSuite

class PluginManagerTest extends FunSuite {
  test("retrieve all plugins at once") {
    val pm = PluginManager
    pm.init()
    assert(pm.plugins.size == 47)
  }

//  test("Retrieve a specific plugin using getPlugin") {
//    val ADCPlugin = PluginManager.getPlugin("ADC")
//    assert(ADCPlugin.name.equals("ADC"))
//  }
}
