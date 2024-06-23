package com.raquo.sbt.domtypes

import upickle.default.*

// This is taken directly from the raquo/laminar-shoelace-components/project/CustomElementsManifest.scala file.
// See: https://github.com/raquo/laminar-shoelace-components/blob/f2894a247b197534e7a30f57287bbf475fc9a242/project/CustomElementsManifest.scala
// See also: See https://github.com/webcomponents/custom-elements-manifest
final case class CustomElementsManifest(
    schemaVersion: String, // "1.0.0"
    readme: String, // ""
    modules: List[CustomElementsManifest.Module]
)

object CustomElementsManifest {

  case class Module(
      kind: String, // "javascript-module"
      path: String, // e.g. "components/alert/alert.js"
      declarations: List[Declaration],
      exports: List[Export]
  )

  case class Declaration(
      kind: String, // "class"
      name: String, // e.g. "SlAnimatedImage"
      description: String = "",
      summary: String,
      tagNameWithoutPrefix: String, // e.g. "animated-image"
      tagName: String, // e.g. "sl-animated-image"
      customElement: Boolean,
      superclass: Superclass,
      jsDoc: String,
      documentation: String = "", // e.g. "https://shoelace.style/components/animated-image"
      status: String, // e.g. "stable"
      since: String, // e.g. "2.0"
      cssProperties: List[CssProperty] = Nil,
      cssParts: List[CssPart] = Nil,
      slots: List[Slot] = Nil,
      members: List[Member] = Nil,
      attributes: List[Attribute] = Nil,
      events: List[Event] = Nil,
      animations: List[Animation] = Nil,
      dependencies: List[String] = Nil // e.g. ["sl-icon"]
  )

  case class CssProperty(
      description: String = "",
      name: String // e.g. "--border-color"
  )

  case class CssPart(
      description: String = "",
      name: String
  )

  case class Slot(
      description: String = "",
      name: String
  )

  // Method keys: kind, name, description, ...?
  case class Member(
      kind: String, // "field" | "method"
      name: String, // e.g. "dependencies" ????, "autoHideTimeout", ...
      description: String = "",
      `type`: ValueType = ValueType(""),
      static: Boolean = false,
      parameters: List[MethodParameter] = Nil, // only if kind == "method"
      attribute: String = "",
      reflects: Boolean = false,
      readonly: Boolean = false,
      default: String = "", // e.g. "'eager'", "''", "new LocalizeController(this)", or "" if not specified
      privacy: String = "public" // "public" | "private"
  )

  case class ValueType(
      text: String // "number" | "object" | "FocusOptions" (custom type example) | undefined | "'stringConstant'" | `"foo | bar" (union)` | "" (if none specified)
  )

  case class MethodParameter(
      name: String, // e.g. "options"
      optional: Boolean = false,
      `type`: ValueType = ValueType("")
  )

  case class Event(
      description: String,
      name: String, // e.g. "sl-show"
      // reactName: String = "", // e.g. "onSlShow", or empty if not defined. I'm guessing it's a not-standard property.
      eventName: String // e.g. "SlShowEvent"
  )

  case class Attribute(
      name: String, // e.g. "formenctype"
      description: String = "",
      `type`: ValueType = ValueType(""),
      resolveInitializer: ResolveInitializer = ResolveInitializer(),
      default: String = "", // e.g. "'eager'", "''", "new LocalizeController(this)", or "" if not specified
      fieldName: String // e.g. "formEnctype"
  )

  case class ResolveInitializer(
      module: String = "" // e.g. "src/components/animation/animation.component.ts", or empty if there is no resolve initializer.
  )

  case class Animation(
      name: String, // e.g. "alert.show"
      description: String
  )

  case class Superclass(
      name: String, // e.g. "ShoelaceElement"
      module: String // e.g. "/src/internal/shoelace-element.js"
  )

  case class Export(
      kind: String, // "js"
      name: String, // e.g. "default"
      declaration: ExportDeclaration
  )

  case class ExportDeclaration(
      name: String, // e.g. "SlAnimatedImage"
      module: String // e.g. "components/animated-image/animated-image.js"
  )

  implicit val exportDeclarationReader: Reader[ExportDeclaration] = macroR

  implicit val exportReader: Reader[Export] = macroR

  implicit val superclassReader: Reader[Superclass] = macroR

  implicit val animationReader: Reader[Animation] = macroR

  implicit val resolveInitializerReader: Reader[ResolveInitializer] = macroR

  implicit val attributeReader: Reader[Attribute] = macroR

  implicit val eventReader: Reader[Event] = macroR

  implicit val methodParameterReader: Reader[MethodParameter] = macroR

  implicit val valueTypeReader: Reader[ValueType] = macroR

  implicit val memberReader: Reader[Member] = macroR

  implicit val slotReader: Reader[Slot] = macroR

  implicit val cssPartReader: Reader[CssPart] = macroR

  implicit val cssPropertyReader: Reader[CssProperty] = macroR

  implicit val declarationReader: Reader[Declaration] = macroR

  implicit val moduleReader: Reader[Module] = macroR

  implicit val reader: Reader[CustomElementsManifest] = macroR
}
