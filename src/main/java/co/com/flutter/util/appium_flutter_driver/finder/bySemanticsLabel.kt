@file:JvmName("_FinderRawMethods")
@file:JvmMultifileClass
package co.com.flutter.util.appium_flutter_driver.finder

import java.util.regex.Pattern;

fun bySemanticsLabel(label: String): FlutterElement {
  return FlutterElement(mapOf(
          "finderType" to "BySemanticsLabel",
          "isRegExp" to false,
          "label" to label
  ))
}

fun bySemanticsLabel(label: Pattern): FlutterElement {
  return FlutterElement(mapOf(
          "finderType" to "BySemanticsLabel",
          "isRegExp" to true,
          "label" to label.toString()
  ))
}
