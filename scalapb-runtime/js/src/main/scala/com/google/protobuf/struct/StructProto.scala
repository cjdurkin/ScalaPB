// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package com.google.protobuf.struct



object StructProto {
  private lazy val ProtoBytes: Array[Byte] =
      com.trueaccord.scalapb.Encoding.fromBase64(scala.collection.Seq(
  """Chxnb29nbGUvcHJvdG9idWYvc3RydWN0LnByb3RvEg9nb29nbGUucHJvdG9idWYimAEKBlN0cnVjdBI7CgZmaWVsZHMYASADK
  AsyIy5nb29nbGUucHJvdG9idWYuU3RydWN0LkZpZWxkc0VudHJ5UgZmaWVsZHMaUQoLRmllbGRzRW50cnkSEAoDa2V5GAEgASgJU
  gNrZXkSLAoFdmFsdWUYAiABKAsyFi5nb29nbGUucHJvdG9idWYuVmFsdWVSBXZhbHVlOgI4ASKyAgoFVmFsdWUSOwoKbnVsbF92Y
  Wx1ZRgBIAEoDjIaLmdvb2dsZS5wcm90b2J1Zi5OdWxsVmFsdWVIAFIJbnVsbFZhbHVlEiMKDG51bWJlcl92YWx1ZRgCIAEoAUgAU
  gtudW1iZXJWYWx1ZRIjCgxzdHJpbmdfdmFsdWUYAyABKAlIAFILc3RyaW5nVmFsdWUSHwoKYm9vbF92YWx1ZRgEIAEoCEgAUglib
  29sVmFsdWUSPAoMc3RydWN0X3ZhbHVlGAUgASgLMhcuZ29vZ2xlLnByb3RvYnVmLlN0cnVjdEgAUgtzdHJ1Y3RWYWx1ZRI7Cgpsa
  XN0X3ZhbHVlGAYgASgLMhouZ29vZ2xlLnByb3RvYnVmLkxpc3RWYWx1ZUgAUglsaXN0VmFsdWVCBgoEa2luZCI7CglMaXN0VmFsd
  WUSLgoGdmFsdWVzGAEgAygLMhYuZ29vZ2xlLnByb3RvYnVmLlZhbHVlUgZ2YWx1ZXMqGwoJTnVsbFZhbHVlEg4KCk5VTExfVkFMV
  UUQAEKBAQoTY29tLmdvb2dsZS5wcm90b2J1ZkILU3RydWN0UHJvdG9QAVoxZ2l0aHViLmNvbS9nb2xhbmcvcHJvdG9idWYvcHR5c
  GVzL3N0cnVjdDtzdHJ1Y3RwYqABAaICA0dQQqoCHkdvb2dsZS5Qcm90b2J1Zi5XZWxsS25vd25UeXBlc2IGcHJvdG8z"""
      ).mkString)
  lazy val scalaDescriptor: _root_.scalapb.descriptors.FileDescriptor = {
    val scalaProto = com.google.protobuf.descriptor.FileDescriptorProto.parseFrom(ProtoBytes)
    _root_.scalapb.descriptors.FileDescriptor.buildFrom(scalaProto, Seq(
    ))
  }
  lazy val javaDescriptor: com.google.protobuf.Descriptors.FileDescriptor = {
    val proto = com.google.protobuf.DescriptorProtos.FileDescriptorProto.parseFrom(ProtoBytes)
    com.google.protobuf.Descriptors.FileDescriptor.buildFrom(proto, Array(
    ))
  }
  @deprecated("Use javaDescriptor instead. In a future version this will refer to scalaDescriptor.", "ScalaPB 0.5.47")
  def descriptor: com.google.protobuf.Descriptors.FileDescriptor = javaDescriptor
}