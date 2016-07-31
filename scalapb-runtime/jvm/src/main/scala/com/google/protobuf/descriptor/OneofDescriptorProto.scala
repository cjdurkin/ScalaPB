// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO2

package com.google.protobuf.descriptor

import scala.collection.JavaConversions._

/** Describes a oneof.
  */
@SerialVersionUID(0L)
final case class OneofDescriptorProto(
    name: scala.Option[String] = None,
    options: scala.Option[com.google.protobuf.descriptor.OneofOptions] = None
    ) extends com.trueaccord.scalapb.GeneratedMessage with com.trueaccord.scalapb.Message[OneofDescriptorProto] with com.trueaccord.lenses.Updatable[OneofDescriptorProto] {
    @transient
    private[this] var __serializedSizeCachedValue: Int = 0
    private[this] def __computeSerializedValue(): Int = {
      var __size = 0
      if (name.isDefined) { __size += com.google.protobuf.CodedOutputStream.computeStringSize(1, name.get) }
      if (options.isDefined) { __size += 1 + com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(options.get.serializedSize) + options.get.serializedSize }
      __size
    }
    final override def serializedSize: Int = {
      var read = __serializedSizeCachedValue
      if (read == 0) {
        read = __computeSerializedValue()
        __serializedSizeCachedValue = read
      }
      read
    }
    def writeTo(`_output__`: com.google.protobuf.CodedOutputStream): Unit = {
      name.foreach { __v =>
        _output__.writeString(1, __v)
      };
      options.foreach { __v =>
        _output__.writeTag(2, 2)
        _output__.writeUInt32NoTag(__v.serializedSize)
        __v.writeTo(_output__)
      };
    }
    def mergeFrom(`_input__`: com.google.protobuf.CodedInputStream): com.google.protobuf.descriptor.OneofDescriptorProto = {
      var __name = this.name
      var __options = this.options
      var _done__ = false
      while (!_done__) {
        val _tag__ = _input__.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case 10 =>
            __name = Some(_input__.readString())
          case 18 =>
            __options = Some(com.trueaccord.scalapb.LiteParser.readMessage(_input__, __options.getOrElse(com.google.protobuf.descriptor.OneofOptions.defaultInstance)))
          case tag => _input__.skipField(tag)
        }
      }
      com.google.protobuf.descriptor.OneofDescriptorProto(
          name = __name,
          options = __options
      )
    }
    def getName: String = name.getOrElse("")
    def clearName: OneofDescriptorProto = copy(name = None)
    def withName(__v: String): OneofDescriptorProto = copy(name = Some(__v))
    def getOptions: com.google.protobuf.descriptor.OneofOptions = options.getOrElse(com.google.protobuf.descriptor.OneofOptions.defaultInstance)
    def clearOptions: OneofDescriptorProto = copy(options = None)
    def withOptions(__v: com.google.protobuf.descriptor.OneofOptions): OneofDescriptorProto = copy(options = Some(__v))
    def getField(__field: com.google.protobuf.Descriptors.FieldDescriptor): scala.Any = {
      __field.getNumber match {
        case 1 => name.getOrElse(null)
        case 2 => options.getOrElse(null)
      }
    }
    override def toString: String = com.trueaccord.scalapb.TextFormat.printToUnicodeString(this)
    def companion = com.google.protobuf.descriptor.OneofDescriptorProto
}

object OneofDescriptorProto extends com.trueaccord.scalapb.GeneratedMessageCompanion[com.google.protobuf.descriptor.OneofDescriptorProto] with com.trueaccord.scalapb.JavaProtoSupport[com.google.protobuf.descriptor.OneofDescriptorProto, com.google.protobuf.DescriptorProtos.OneofDescriptorProto] {
  implicit def messageCompanion: com.trueaccord.scalapb.GeneratedMessageCompanion[com.google.protobuf.descriptor.OneofDescriptorProto] with com.trueaccord.scalapb.JavaProtoSupport[com.google.protobuf.descriptor.OneofDescriptorProto, com.google.protobuf.DescriptorProtos.OneofDescriptorProto] = this
  def toJavaProto(scalaPbSource: com.google.protobuf.descriptor.OneofDescriptorProto): com.google.protobuf.DescriptorProtos.OneofDescriptorProto = {
    val javaPbOut = com.google.protobuf.DescriptorProtos.OneofDescriptorProto.newBuilder
    scalaPbSource.name.foreach(javaPbOut.setName)
    scalaPbSource.options.map(com.google.protobuf.descriptor.OneofOptions.toJavaProto(_)).foreach(javaPbOut.setOptions)
    javaPbOut.build
  }
  def fromJavaProto(javaPbSource: com.google.protobuf.DescriptorProtos.OneofDescriptorProto): com.google.protobuf.descriptor.OneofDescriptorProto = com.google.protobuf.descriptor.OneofDescriptorProto(
    name = if (javaPbSource.hasName) Some(javaPbSource.getName) else None,
    options = if (javaPbSource.hasOptions) Some(com.google.protobuf.descriptor.OneofOptions.fromJavaProto(javaPbSource.getOptions)) else None
  )
  def fromFieldsMap(__fieldsMap: scala.collection.immutable.Map[com.google.protobuf.Descriptors.FieldDescriptor, scala.Any]): com.google.protobuf.descriptor.OneofDescriptorProto = {
    require(__fieldsMap.keys.forall(_.getContainingType() == descriptor), "FieldDescriptor does not match message type.")
    val __fields = descriptor.getFields
    com.google.protobuf.descriptor.OneofDescriptorProto(
      __fieldsMap.get(__fields.get(0)).asInstanceOf[scala.Option[String]],
      __fieldsMap.get(__fields.get(1)).asInstanceOf[scala.Option[com.google.protobuf.descriptor.OneofOptions]]
    )
  }
  def descriptor: com.google.protobuf.Descriptors.Descriptor = DescriptorProtoCompanion.descriptor.getMessageTypes.get(4)
  def messageCompanionForField(__field: com.google.protobuf.Descriptors.FieldDescriptor): com.trueaccord.scalapb.GeneratedMessageCompanion[_] = {
    require(__field.getContainingType() == descriptor, "FieldDescriptor does not match message type.")
    var __out: com.trueaccord.scalapb.GeneratedMessageCompanion[_] = null
    __field.getNumber match {
      case 2 => __out = com.google.protobuf.descriptor.OneofOptions
    }
  __out
  }
  def enumCompanionForField(__field: com.google.protobuf.Descriptors.FieldDescriptor): com.trueaccord.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__field)
  lazy val defaultInstance = com.google.protobuf.descriptor.OneofDescriptorProto(
  )
  implicit class OneofDescriptorProtoLens[UpperPB](_l: com.trueaccord.lenses.Lens[UpperPB, com.google.protobuf.descriptor.OneofDescriptorProto]) extends com.trueaccord.lenses.ObjectLens[UpperPB, com.google.protobuf.descriptor.OneofDescriptorProto](_l) {
    def name: com.trueaccord.lenses.Lens[UpperPB, String] = field(_.getName)((c_, f_) => c_.copy(name = Some(f_)))
    def optionalName: com.trueaccord.lenses.Lens[UpperPB, scala.Option[String]] = field(_.name)((c_, f_) => c_.copy(name = f_))
    def options: com.trueaccord.lenses.Lens[UpperPB, com.google.protobuf.descriptor.OneofOptions] = field(_.getOptions)((c_, f_) => c_.copy(options = Some(f_)))
    def optionalOptions: com.trueaccord.lenses.Lens[UpperPB, scala.Option[com.google.protobuf.descriptor.OneofOptions]] = field(_.options)((c_, f_) => c_.copy(options = f_))
  }
  final val NAME_FIELD_NUMBER = 1
  final val OPTIONS_FIELD_NUMBER = 2
}
