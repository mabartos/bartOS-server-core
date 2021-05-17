// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PATH/home.proto

package org.bartos.core.protobuf;

/**
 * Protobuf type {@code home.RoomDTO}
 */
public final class RoomDTO extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:home.RoomDTO)
    RoomDTOOrBuilder {
private static final long serialVersionUID = 0L;
  // Use RoomDTO.newBuilder() to construct.
  private RoomDTO(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RoomDTO() {
    id_ = "";
    name_ = "";
    type_ = 0;
    homeId_ = "";
    devices_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new RoomDTO();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private RoomDTO(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            id_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            name_ = s;
            break;
          }
          case 24: {
            int rawValue = input.readEnum();

            type_ = rawValue;
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            homeId_ = s;
            break;
          }
          case 42: {
            java.lang.String s = input.readStringRequireUtf8();
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              devices_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000001;
            }
            devices_.add(s);
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        devices_ = devices_.getUnmodifiableView();
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return HomeProto.internal_static_home_RoomDTO_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return HomeProto.internal_static_home_RoomDTO_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            RoomDTO.class, RoomDTO.Builder.class);
  }

  /**
   * Protobuf enum {@code home.RoomDTO.RoomType}
   */
  public enum RoomType
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>NONE = 0;</code>
     */
    NONE(0),
    /**
     * <code>KITCHEN = 1;</code>
     */
    KITCHEN(1),
    /**
     * <code>BEDROOM = 2;</code>
     */
    BEDROOM(2),
    /**
     * <code>BATHROOM = 3;</code>
     */
    BATHROOM(3),
    /**
     * <code>LIVING_ROOM = 4;</code>
     */
    LIVING_ROOM(4),
    /**
     * <code>GARAGE = 5;</code>
     */
    GARAGE(5),
    /**
     * <code>OTHER = 6;</code>
     */
    OTHER(6),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>NONE = 0;</code>
     */
    public static final int NONE_VALUE = 0;
    /**
     * <code>KITCHEN = 1;</code>
     */
    public static final int KITCHEN_VALUE = 1;
    /**
     * <code>BEDROOM = 2;</code>
     */
    public static final int BEDROOM_VALUE = 2;
    /**
     * <code>BATHROOM = 3;</code>
     */
    public static final int BATHROOM_VALUE = 3;
    /**
     * <code>LIVING_ROOM = 4;</code>
     */
    public static final int LIVING_ROOM_VALUE = 4;
    /**
     * <code>GARAGE = 5;</code>
     */
    public static final int GARAGE_VALUE = 5;
    /**
     * <code>OTHER = 6;</code>
     */
    public static final int OTHER_VALUE = 6;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static RoomType valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static RoomType forNumber(int value) {
      switch (value) {
        case 0: return NONE;
        case 1: return KITCHEN;
        case 2: return BEDROOM;
        case 3: return BATHROOM;
        case 4: return LIVING_ROOM;
        case 5: return GARAGE;
        case 6: return OTHER;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<RoomType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        RoomType> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<RoomType>() {
            public RoomType findValueByNumber(int number) {
              return RoomType.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return RoomDTO.getDescriptor().getEnumTypes().get(0);
    }

    private static final RoomType[] VALUES = values();

    public static RoomType valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private RoomType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:home.RoomDTO.RoomType)
  }

  public static final int ID_FIELD_NUMBER = 1;
  private volatile java.lang.Object id_;
  /**
   * <code>string id = 1;</code>
   * @return The id.
   */
  @java.lang.Override
  public java.lang.String getId() {
    java.lang.Object ref = id_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      id_ = s;
      return s;
    }
  }
  /**
   * <code>string id = 1;</code>
   * @return The bytes for id.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getIdBytes() {
    java.lang.Object ref = id_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      id_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int NAME_FIELD_NUMBER = 2;
  private volatile java.lang.Object name_;
  /**
   * <code>string name = 2;</code>
   * @return The name.
   */
  @java.lang.Override
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   * <code>string name = 2;</code>
   * @return The bytes for name.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TYPE_FIELD_NUMBER = 3;
  private int type_;
  /**
   * <code>.home.RoomDTO.RoomType type = 3;</code>
   * @return The enum numeric value on the wire for type.
   */
  @java.lang.Override public int getTypeValue() {
    return type_;
  }
  /**
   * <code>.home.RoomDTO.RoomType type = 3;</code>
   * @return The type.
   */
  @java.lang.Override public RoomDTO.RoomType getType() {
    @SuppressWarnings("deprecation")
    RoomDTO.RoomType result = RoomDTO.RoomType.valueOf(type_);
    return result == null ? RoomDTO.RoomType.UNRECOGNIZED : result;
  }

  public static final int HOME_ID_FIELD_NUMBER = 4;
  private volatile java.lang.Object homeId_;
  /**
   * <code>string home_id = 4;</code>
   * @return The homeId.
   */
  @java.lang.Override
  public java.lang.String getHomeId() {
    java.lang.Object ref = homeId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      homeId_ = s;
      return s;
    }
  }
  /**
   * <code>string home_id = 4;</code>
   * @return The bytes for homeId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getHomeIdBytes() {
    java.lang.Object ref = homeId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      homeId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DEVICES_FIELD_NUMBER = 5;
  private com.google.protobuf.LazyStringList devices_;
  /**
   * <code>repeated string devices = 5;</code>
   * @return A list containing the devices.
   */
  public com.google.protobuf.ProtocolStringList
      getDevicesList() {
    return devices_;
  }
  /**
   * <code>repeated string devices = 5;</code>
   * @return The count of devices.
   */
  public int getDevicesCount() {
    return devices_.size();
  }
  /**
   * <code>repeated string devices = 5;</code>
   * @param index The index of the element to return.
   * @return The devices at the given index.
   */
  public java.lang.String getDevices(int index) {
    return devices_.get(index);
  }
  /**
   * <code>repeated string devices = 5;</code>
   * @param index The index of the value to return.
   * @return The bytes of the devices at the given index.
   */
  public com.google.protobuf.ByteString
      getDevicesBytes(int index) {
    return devices_.getByteString(index);
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, id_);
    }
    if (!getNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, name_);
    }
    if (type_ != RoomDTO.RoomType.NONE.getNumber()) {
      output.writeEnum(3, type_);
    }
    if (!getHomeIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, homeId_);
    }
    for (int i = 0; i < devices_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, devices_.getRaw(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, id_);
    }
    if (!getNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, name_);
    }
    if (type_ != RoomDTO.RoomType.NONE.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(3, type_);
    }
    if (!getHomeIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, homeId_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < devices_.size(); i++) {
        dataSize += computeStringSizeNoTag(devices_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getDevicesList().size();
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof RoomDTO)) {
      return super.equals(obj);
    }
    RoomDTO other = (RoomDTO) obj;

    if (!getId()
        .equals(other.getId())) return false;
    if (!getName()
        .equals(other.getName())) return false;
    if (type_ != other.type_) return false;
    if (!getHomeId()
        .equals(other.getHomeId())) return false;
    if (!getDevicesList()
        .equals(other.getDevicesList())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + ID_FIELD_NUMBER;
    hash = (53 * hash) + getId().hashCode();
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    hash = (37 * hash) + TYPE_FIELD_NUMBER;
    hash = (53 * hash) + type_;
    hash = (37 * hash) + HOME_ID_FIELD_NUMBER;
    hash = (53 * hash) + getHomeId().hashCode();
    if (getDevicesCount() > 0) {
      hash = (37 * hash) + DEVICES_FIELD_NUMBER;
      hash = (53 * hash) + getDevicesList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static RoomDTO parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static RoomDTO parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static RoomDTO parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static RoomDTO parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static RoomDTO parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static RoomDTO parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static RoomDTO parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static RoomDTO parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static RoomDTO parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static RoomDTO parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static RoomDTO parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static RoomDTO parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(RoomDTO prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code home.RoomDTO}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:home.RoomDTO)
          RoomDTOOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return HomeProto.internal_static_home_RoomDTO_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return HomeProto.internal_static_home_RoomDTO_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              RoomDTO.class, RoomDTO.Builder.class);
    }

    // Construct using org.bartos.core.protobuf.RoomDTO.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      id_ = "";

      name_ = "";

      type_ = 0;

      homeId_ = "";

      devices_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return HomeProto.internal_static_home_RoomDTO_descriptor;
    }

    @java.lang.Override
    public RoomDTO getDefaultInstanceForType() {
      return RoomDTO.getDefaultInstance();
    }

    @java.lang.Override
    public RoomDTO build() {
      RoomDTO result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public RoomDTO buildPartial() {
      RoomDTO result = new RoomDTO(this);
      int from_bitField0_ = bitField0_;
      result.id_ = id_;
      result.name_ = name_;
      result.type_ = type_;
      result.homeId_ = homeId_;
      if (((bitField0_ & 0x00000001) != 0)) {
        devices_ = devices_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.devices_ = devices_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof RoomDTO) {
        return mergeFrom((RoomDTO)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(RoomDTO other) {
      if (other == RoomDTO.getDefaultInstance()) return this;
      if (!other.getId().isEmpty()) {
        id_ = other.id_;
        onChanged();
      }
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      if (other.type_ != 0) {
        setTypeValue(other.getTypeValue());
      }
      if (!other.getHomeId().isEmpty()) {
        homeId_ = other.homeId_;
        onChanged();
      }
      if (!other.devices_.isEmpty()) {
        if (devices_.isEmpty()) {
          devices_ = other.devices_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureDevicesIsMutable();
          devices_.addAll(other.devices_);
        }
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      RoomDTO parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (RoomDTO) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object id_ = "";
    /**
     * <code>string id = 1;</code>
     * @return The id.
     */
    public java.lang.String getId() {
      java.lang.Object ref = id_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        id_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string id = 1;</code>
     * @return The bytes for id.
     */
    public com.google.protobuf.ByteString
        getIdBytes() {
      java.lang.Object ref = id_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        id_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string id = 1;</code>
     * @param value The id to set.
     * @return This builder for chaining.
     */
    public Builder setId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      id_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearId() {
      
      id_ = getDefaultInstance().getId();
      onChanged();
      return this;
    }
    /**
     * <code>string id = 1;</code>
     * @param value The bytes for id to set.
     * @return This builder for chaining.
     */
    public Builder setIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      id_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object name_ = "";
    /**
     * <code>string name = 2;</code>
     * @return The name.
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string name = 2;</code>
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string name = 2;</code>
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      name_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string name = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearName() {
      
      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     * <code>string name = 2;</code>
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      name_ = value;
      onChanged();
      return this;
    }

    private int type_ = 0;
    /**
     * <code>.home.RoomDTO.RoomType type = 3;</code>
     * @return The enum numeric value on the wire for type.
     */
    @java.lang.Override public int getTypeValue() {
      return type_;
    }
    /**
     * <code>.home.RoomDTO.RoomType type = 3;</code>
     * @param value The enum numeric value on the wire for type to set.
     * @return This builder for chaining.
     */
    public Builder setTypeValue(int value) {
      
      type_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.home.RoomDTO.RoomType type = 3;</code>
     * @return The type.
     */
    @java.lang.Override
    public RoomDTO.RoomType getType() {
      @SuppressWarnings("deprecation")
      RoomDTO.RoomType result = RoomDTO.RoomType.valueOf(type_);
      return result == null ? RoomDTO.RoomType.UNRECOGNIZED : result;
    }
    /**
     * <code>.home.RoomDTO.RoomType type = 3;</code>
     * @param value The type to set.
     * @return This builder for chaining.
     */
    public Builder setType(RoomDTO.RoomType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      type_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.home.RoomDTO.RoomType type = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearType() {
      
      type_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object homeId_ = "";
    /**
     * <code>string home_id = 4;</code>
     * @return The homeId.
     */
    public java.lang.String getHomeId() {
      java.lang.Object ref = homeId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        homeId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string home_id = 4;</code>
     * @return The bytes for homeId.
     */
    public com.google.protobuf.ByteString
        getHomeIdBytes() {
      java.lang.Object ref = homeId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        homeId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string home_id = 4;</code>
     * @param value The homeId to set.
     * @return This builder for chaining.
     */
    public Builder setHomeId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      homeId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string home_id = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearHomeId() {
      
      homeId_ = getDefaultInstance().getHomeId();
      onChanged();
      return this;
    }
    /**
     * <code>string home_id = 4;</code>
     * @param value The bytes for homeId to set.
     * @return This builder for chaining.
     */
    public Builder setHomeIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      homeId_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringList devices_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureDevicesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        devices_ = new com.google.protobuf.LazyStringArrayList(devices_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <code>repeated string devices = 5;</code>
     * @return A list containing the devices.
     */
    public com.google.protobuf.ProtocolStringList
        getDevicesList() {
      return devices_.getUnmodifiableView();
    }
    /**
     * <code>repeated string devices = 5;</code>
     * @return The count of devices.
     */
    public int getDevicesCount() {
      return devices_.size();
    }
    /**
     * <code>repeated string devices = 5;</code>
     * @param index The index of the element to return.
     * @return The devices at the given index.
     */
    public java.lang.String getDevices(int index) {
      return devices_.get(index);
    }
    /**
     * <code>repeated string devices = 5;</code>
     * @param index The index of the value to return.
     * @return The bytes of the devices at the given index.
     */
    public com.google.protobuf.ByteString
        getDevicesBytes(int index) {
      return devices_.getByteString(index);
    }
    /**
     * <code>repeated string devices = 5;</code>
     * @param index The index to set the value at.
     * @param value The devices to set.
     * @return This builder for chaining.
     */
    public Builder setDevices(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureDevicesIsMutable();
      devices_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string devices = 5;</code>
     * @param value The devices to add.
     * @return This builder for chaining.
     */
    public Builder addDevices(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureDevicesIsMutable();
      devices_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string devices = 5;</code>
     * @param values The devices to add.
     * @return This builder for chaining.
     */
    public Builder addAllDevices(
        java.lang.Iterable<java.lang.String> values) {
      ensureDevicesIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, devices_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string devices = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearDevices() {
      devices_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string devices = 5;</code>
     * @param value The bytes of the devices to add.
     * @return This builder for chaining.
     */
    public Builder addDevicesBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureDevicesIsMutable();
      devices_.add(value);
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:home.RoomDTO)
  }

  // @@protoc_insertion_point(class_scope:home.RoomDTO)
  private static final RoomDTO DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new RoomDTO();
  }

  public static RoomDTO getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RoomDTO>
      PARSER = new com.google.protobuf.AbstractParser<RoomDTO>() {
    @java.lang.Override
    public RoomDTO parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new RoomDTO(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<RoomDTO> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RoomDTO> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public RoomDTO getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

