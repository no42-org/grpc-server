// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ipc.proto

package org.opennms.core.ipc.grpc.common;

public interface RpcRequestProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:RpcRequestProto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string rpc_id = 1;</code>
   */
  java.lang.String getRpcId();
  /**
   * <code>string rpc_id = 1;</code>
   */
  com.google.protobuf.ByteString
      getRpcIdBytes();

  /**
   * <code>bytes rpc_content = 2;</code>
   */
  com.google.protobuf.ByteString getRpcContent();

  /**
   * <code>string system_id = 3;</code>
   */
  java.lang.String getSystemId();
  /**
   * <code>string system_id = 3;</code>
   */
  com.google.protobuf.ByteString
      getSystemIdBytes();

  /**
   * <code>string location = 4;</code>
   */
  java.lang.String getLocation();
  /**
   * <code>string location = 4;</code>
   */
  com.google.protobuf.ByteString
      getLocationBytes();

  /**
   * <code>string module_id = 5;</code>
   */
  java.lang.String getModuleId();
  /**
   * <code>string module_id = 5;</code>
   */
  com.google.protobuf.ByteString
      getModuleIdBytes();

  /**
   * <pre>
   * absolute time elapsed since the epoch in msec.
   * </pre>
   *
   * <code>uint64 expiration_time = 6;</code>
   */
  long getExpirationTime();

  /**
   * <code>map&lt;string, string&gt; tracing_info = 7;</code>
   */
  int getTracingInfoCount();
  /**
   * <code>map&lt;string, string&gt; tracing_info = 7;</code>
   */
  boolean containsTracingInfo(
      java.lang.String key);
  /**
   * Use {@link #getTracingInfoMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String>
  getTracingInfo();
  /**
   * <code>map&lt;string, string&gt; tracing_info = 7;</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getTracingInfoMap();
  /**
   * <code>map&lt;string, string&gt; tracing_info = 7;</code>
   */

  java.lang.String getTracingInfoOrDefault(
      java.lang.String key,
      java.lang.String defaultValue);
  /**
   * <code>map&lt;string, string&gt; tracing_info = 7;</code>
   */

  java.lang.String getTracingInfoOrThrow(
      java.lang.String key);
}
