// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package com.google.protobuf.wrappers

import scala.collection.JavaConversions._

/** Wrapper message for `uint64`.
  *
  * The JSON representation for `UInt64Value` is JSON string.
  *
  * @param value
  *   The uint64 value.
  */
@SerialVersionUID(0L)
final case class UInt64Value(
    value: Long = 0L
    ) extends com.trueaccord.scalapb.GeneratedMessage with com.trueaccord.scalapb.Message[UInt64Value] with com.trueaccord.lenses.Updatable[UInt64Value] {
    @transient
    private[this] var __serializedSizeCachedValue: Int = 0
    private[this] def __computeSerializedValue(): Int = {
      var __size = 0
      if (value != 0L) { __size += com.google.protobuf.CodedOutputStream.computeUInt64Size(1, value) }
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
      {
        val __v = value
        if (__v != 0L) {
          _output__.writeUInt64(1, __v)
        }
      };
    }
    def mergeFrom(`_input__`: com.google.protobuf.CodedInputStream): com.google.protobuf.wrappers.UInt64Value = {
      var __value = this.value
      var _done__ = false
      while (!_done__) {
        val _tag__ = _input__.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case 8 =>
            __value = _input__.readUInt64()
          case tag => _input__.skipField(tag)
        }
      }
      com.google.protobuf.wrappers.UInt64Value(
          value = __value
      )
    }
    def withValue(__v: Long): UInt64Value = copy(value = __v)
    def getField(__field: com.google.protobuf.Descriptors.FieldDescriptor): scala.Any = {
      __field.getNumber match {
        case 1 => {
          val __t = value
          if (__t != 0L) __t else null
        }
      }
    }
    override def toString: String = com.trueaccord.scalapb.TextFormat.printToUnicodeString(this)
    def companion = com.google.protobuf.wrappers.UInt64Value
}

object UInt64Value extends com.trueaccord.scalapb.GeneratedMessageCompanion[com.google.protobuf.wrappers.UInt64Value] with com.trueaccord.scalapb.JavaProtoSupport[com.google.protobuf.wrappers.UInt64Value, com.google.protobuf.UInt64Value] {
  implicit def messageCompanion: com.trueaccord.scalapb.GeneratedMessageCompanion[com.google.protobuf.wrappers.UInt64Value] with com.trueaccord.scalapb.JavaProtoSupport[com.google.protobuf.wrappers.UInt64Value, com.google.protobuf.UInt64Value] = this
  def toJavaProto(scalaPbSource: com.google.protobuf.wrappers.UInt64Value): com.google.protobuf.UInt64Value = {
    val javaPbOut = com.google.protobuf.UInt64Value.newBuilder
    javaPbOut.setValue(scalaPbSource.value)
    javaPbOut.build
  }
  def fromJavaProto(javaPbSource: com.google.protobuf.UInt64Value): com.google.protobuf.wrappers.UInt64Value = com.google.protobuf.wrappers.UInt64Value(
    value = javaPbSource.getValue.longValue
  )
  def fromFieldsMap(__fieldsMap: scala.collection.immutable.Map[com.google.protobuf.Descriptors.FieldDescriptor, scala.Any]): com.google.protobuf.wrappers.UInt64Value = {
    require(__fieldsMap.keys.forall(_.getContainingType() == descriptor), "FieldDescriptor does not match message type.")
    val __fields = descriptor.getFields
    com.google.protobuf.wrappers.UInt64Value(
      __fieldsMap.getOrElse(__fields.get(0), 0L).asInstanceOf[Long]
    )
  }
  def descriptor: com.google.protobuf.Descriptors.Descriptor = WrappersProto.descriptor.getMessageTypes.get(3)
  def messageCompanionForField(__field: com.google.protobuf.Descriptors.FieldDescriptor): com.trueaccord.scalapb.GeneratedMessageCompanion[_] = throw new MatchError(__field)
  def enumCompanionForField(__field: com.google.protobuf.Descriptors.FieldDescriptor): com.trueaccord.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__field)
  lazy val defaultInstance = com.google.protobuf.wrappers.UInt64Value(
  )
  implicit class UInt64ValueLens[UpperPB](_l: com.trueaccord.lenses.Lens[UpperPB, com.google.protobuf.wrappers.UInt64Value]) extends com.trueaccord.lenses.ObjectLens[UpperPB, com.google.protobuf.wrappers.UInt64Value](_l) {
    def value: com.trueaccord.lenses.Lens[UpperPB, Long] = field(_.value)((c_, f_) => c_.copy(value = f_))
  }
  final val VALUE_FIELD_NUMBER = 1
}
