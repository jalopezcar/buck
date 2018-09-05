/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.facebook.buck.distributed.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.11.0)")
public class BuildJobStateBuckConfig implements org.apache.thrift.TBase<BuildJobStateBuckConfig, BuildJobStateBuckConfig._Fields>, java.io.Serializable, Cloneable, Comparable<BuildJobStateBuckConfig> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("BuildJobStateBuckConfig");

  private static final org.apache.thrift.protocol.TField USER_ENVIRONMENT_FIELD_DESC = new org.apache.thrift.protocol.TField("userEnvironment", org.apache.thrift.protocol.TType.MAP, (short)1);
  private static final org.apache.thrift.protocol.TField RAW_BUCK_CONFIG_FIELD_DESC = new org.apache.thrift.protocol.TField("rawBuckConfig", org.apache.thrift.protocol.TType.MAP, (short)2);
  private static final org.apache.thrift.protocol.TField ARCHITECTURE_FIELD_DESC = new org.apache.thrift.protocol.TField("architecture", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField PLATFORM_FIELD_DESC = new org.apache.thrift.protocol.TField("platform", org.apache.thrift.protocol.TType.STRING, (short)4);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new BuildJobStateBuckConfigStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new BuildJobStateBuckConfigTupleSchemeFactory();

  public java.util.Map<java.lang.String,java.lang.String> userEnvironment; // optional
  public java.util.Map<java.lang.String,java.util.List<OrderedStringMapEntry>> rawBuckConfig; // optional
  public java.lang.String architecture; // optional
  public java.lang.String platform; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    USER_ENVIRONMENT((short)1, "userEnvironment"),
    RAW_BUCK_CONFIG((short)2, "rawBuckConfig"),
    ARCHITECTURE((short)3, "architecture"),
    PLATFORM((short)4, "platform");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // USER_ENVIRONMENT
          return USER_ENVIRONMENT;
        case 2: // RAW_BUCK_CONFIG
          return RAW_BUCK_CONFIG;
        case 3: // ARCHITECTURE
          return ARCHITECTURE;
        case 4: // PLATFORM
          return PLATFORM;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new java.lang.IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(java.lang.String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final java.lang.String _fieldName;

    _Fields(short thriftId, java.lang.String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public java.lang.String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final _Fields optionals[] = {_Fields.USER_ENVIRONMENT,_Fields.RAW_BUCK_CONFIG,_Fields.ARCHITECTURE,_Fields.PLATFORM};
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.USER_ENVIRONMENT, new org.apache.thrift.meta_data.FieldMetaData("userEnvironment", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING), 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    tmpMap.put(_Fields.RAW_BUCK_CONFIG, new org.apache.thrift.meta_data.FieldMetaData("rawBuckConfig", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING), 
            new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
                new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, OrderedStringMapEntry.class)))));
    tmpMap.put(_Fields.ARCHITECTURE, new org.apache.thrift.meta_data.FieldMetaData("architecture", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.PLATFORM, new org.apache.thrift.meta_data.FieldMetaData("platform", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(BuildJobStateBuckConfig.class, metaDataMap);
  }

  public BuildJobStateBuckConfig() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public BuildJobStateBuckConfig(BuildJobStateBuckConfig other) {
    if (other.isSetUserEnvironment()) {
      java.util.Map<java.lang.String,java.lang.String> __this__userEnvironment = new java.util.HashMap<java.lang.String,java.lang.String>(other.userEnvironment);
      this.userEnvironment = __this__userEnvironment;
    }
    if (other.isSetRawBuckConfig()) {
      java.util.Map<java.lang.String,java.util.List<OrderedStringMapEntry>> __this__rawBuckConfig = new java.util.HashMap<java.lang.String,java.util.List<OrderedStringMapEntry>>(other.rawBuckConfig.size());
      for (java.util.Map.Entry<java.lang.String, java.util.List<OrderedStringMapEntry>> other_element : other.rawBuckConfig.entrySet()) {

        java.lang.String other_element_key = other_element.getKey();
        java.util.List<OrderedStringMapEntry> other_element_value = other_element.getValue();

        java.lang.String __this__rawBuckConfig_copy_key = other_element_key;

        java.util.List<OrderedStringMapEntry> __this__rawBuckConfig_copy_value = new java.util.ArrayList<OrderedStringMapEntry>(other_element_value.size());
        for (OrderedStringMapEntry other_element_value_element : other_element_value) {
          __this__rawBuckConfig_copy_value.add(new OrderedStringMapEntry(other_element_value_element));
        }

        __this__rawBuckConfig.put(__this__rawBuckConfig_copy_key, __this__rawBuckConfig_copy_value);
      }
      this.rawBuckConfig = __this__rawBuckConfig;
    }
    if (other.isSetArchitecture()) {
      this.architecture = other.architecture;
    }
    if (other.isSetPlatform()) {
      this.platform = other.platform;
    }
  }

  public BuildJobStateBuckConfig deepCopy() {
    return new BuildJobStateBuckConfig(this);
  }

  @Override
  public void clear() {
    this.userEnvironment = null;
    this.rawBuckConfig = null;
    this.architecture = null;
    this.platform = null;
  }

  public int getUserEnvironmentSize() {
    return (this.userEnvironment == null) ? 0 : this.userEnvironment.size();
  }

  public void putToUserEnvironment(java.lang.String key, java.lang.String val) {
    if (this.userEnvironment == null) {
      this.userEnvironment = new java.util.HashMap<java.lang.String,java.lang.String>();
    }
    this.userEnvironment.put(key, val);
  }

  public java.util.Map<java.lang.String,java.lang.String> getUserEnvironment() {
    return this.userEnvironment;
  }

  public BuildJobStateBuckConfig setUserEnvironment(java.util.Map<java.lang.String,java.lang.String> userEnvironment) {
    this.userEnvironment = userEnvironment;
    return this;
  }

  public void unsetUserEnvironment() {
    this.userEnvironment = null;
  }

  /** Returns true if field userEnvironment is set (has been assigned a value) and false otherwise */
  public boolean isSetUserEnvironment() {
    return this.userEnvironment != null;
  }

  public void setUserEnvironmentIsSet(boolean value) {
    if (!value) {
      this.userEnvironment = null;
    }
  }

  public int getRawBuckConfigSize() {
    return (this.rawBuckConfig == null) ? 0 : this.rawBuckConfig.size();
  }

  public void putToRawBuckConfig(java.lang.String key, java.util.List<OrderedStringMapEntry> val) {
    if (this.rawBuckConfig == null) {
      this.rawBuckConfig = new java.util.HashMap<java.lang.String,java.util.List<OrderedStringMapEntry>>();
    }
    this.rawBuckConfig.put(key, val);
  }

  public java.util.Map<java.lang.String,java.util.List<OrderedStringMapEntry>> getRawBuckConfig() {
    return this.rawBuckConfig;
  }

  public BuildJobStateBuckConfig setRawBuckConfig(java.util.Map<java.lang.String,java.util.List<OrderedStringMapEntry>> rawBuckConfig) {
    this.rawBuckConfig = rawBuckConfig;
    return this;
  }

  public void unsetRawBuckConfig() {
    this.rawBuckConfig = null;
  }

  /** Returns true if field rawBuckConfig is set (has been assigned a value) and false otherwise */
  public boolean isSetRawBuckConfig() {
    return this.rawBuckConfig != null;
  }

  public void setRawBuckConfigIsSet(boolean value) {
    if (!value) {
      this.rawBuckConfig = null;
    }
  }

  public java.lang.String getArchitecture() {
    return this.architecture;
  }

  public BuildJobStateBuckConfig setArchitecture(java.lang.String architecture) {
    this.architecture = architecture;
    return this;
  }

  public void unsetArchitecture() {
    this.architecture = null;
  }

  /** Returns true if field architecture is set (has been assigned a value) and false otherwise */
  public boolean isSetArchitecture() {
    return this.architecture != null;
  }

  public void setArchitectureIsSet(boolean value) {
    if (!value) {
      this.architecture = null;
    }
  }

  public java.lang.String getPlatform() {
    return this.platform;
  }

  public BuildJobStateBuckConfig setPlatform(java.lang.String platform) {
    this.platform = platform;
    return this;
  }

  public void unsetPlatform() {
    this.platform = null;
  }

  /** Returns true if field platform is set (has been assigned a value) and false otherwise */
  public boolean isSetPlatform() {
    return this.platform != null;
  }

  public void setPlatformIsSet(boolean value) {
    if (!value) {
      this.platform = null;
    }
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case USER_ENVIRONMENT:
      if (value == null) {
        unsetUserEnvironment();
      } else {
        setUserEnvironment((java.util.Map<java.lang.String,java.lang.String>)value);
      }
      break;

    case RAW_BUCK_CONFIG:
      if (value == null) {
        unsetRawBuckConfig();
      } else {
        setRawBuckConfig((java.util.Map<java.lang.String,java.util.List<OrderedStringMapEntry>>)value);
      }
      break;

    case ARCHITECTURE:
      if (value == null) {
        unsetArchitecture();
      } else {
        setArchitecture((java.lang.String)value);
      }
      break;

    case PLATFORM:
      if (value == null) {
        unsetPlatform();
      } else {
        setPlatform((java.lang.String)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case USER_ENVIRONMENT:
      return getUserEnvironment();

    case RAW_BUCK_CONFIG:
      return getRawBuckConfig();

    case ARCHITECTURE:
      return getArchitecture();

    case PLATFORM:
      return getPlatform();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case USER_ENVIRONMENT:
      return isSetUserEnvironment();
    case RAW_BUCK_CONFIG:
      return isSetRawBuckConfig();
    case ARCHITECTURE:
      return isSetArchitecture();
    case PLATFORM:
      return isSetPlatform();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof BuildJobStateBuckConfig)
      return this.equals((BuildJobStateBuckConfig)that);
    return false;
  }

  public boolean equals(BuildJobStateBuckConfig that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_userEnvironment = true && this.isSetUserEnvironment();
    boolean that_present_userEnvironment = true && that.isSetUserEnvironment();
    if (this_present_userEnvironment || that_present_userEnvironment) {
      if (!(this_present_userEnvironment && that_present_userEnvironment))
        return false;
      if (!this.userEnvironment.equals(that.userEnvironment))
        return false;
    }

    boolean this_present_rawBuckConfig = true && this.isSetRawBuckConfig();
    boolean that_present_rawBuckConfig = true && that.isSetRawBuckConfig();
    if (this_present_rawBuckConfig || that_present_rawBuckConfig) {
      if (!(this_present_rawBuckConfig && that_present_rawBuckConfig))
        return false;
      if (!this.rawBuckConfig.equals(that.rawBuckConfig))
        return false;
    }

    boolean this_present_architecture = true && this.isSetArchitecture();
    boolean that_present_architecture = true && that.isSetArchitecture();
    if (this_present_architecture || that_present_architecture) {
      if (!(this_present_architecture && that_present_architecture))
        return false;
      if (!this.architecture.equals(that.architecture))
        return false;
    }

    boolean this_present_platform = true && this.isSetPlatform();
    boolean that_present_platform = true && that.isSetPlatform();
    if (this_present_platform || that_present_platform) {
      if (!(this_present_platform && that_present_platform))
        return false;
      if (!this.platform.equals(that.platform))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetUserEnvironment()) ? 131071 : 524287);
    if (isSetUserEnvironment())
      hashCode = hashCode * 8191 + userEnvironment.hashCode();

    hashCode = hashCode * 8191 + ((isSetRawBuckConfig()) ? 131071 : 524287);
    if (isSetRawBuckConfig())
      hashCode = hashCode * 8191 + rawBuckConfig.hashCode();

    hashCode = hashCode * 8191 + ((isSetArchitecture()) ? 131071 : 524287);
    if (isSetArchitecture())
      hashCode = hashCode * 8191 + architecture.hashCode();

    hashCode = hashCode * 8191 + ((isSetPlatform()) ? 131071 : 524287);
    if (isSetPlatform())
      hashCode = hashCode * 8191 + platform.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(BuildJobStateBuckConfig other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetUserEnvironment()).compareTo(other.isSetUserEnvironment());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUserEnvironment()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.userEnvironment, other.userEnvironment);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetRawBuckConfig()).compareTo(other.isSetRawBuckConfig());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRawBuckConfig()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.rawBuckConfig, other.rawBuckConfig);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetArchitecture()).compareTo(other.isSetArchitecture());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetArchitecture()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.architecture, other.architecture);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetPlatform()).compareTo(other.isSetPlatform());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPlatform()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.platform, other.platform);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    scheme(iprot).read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("BuildJobStateBuckConfig(");
    boolean first = true;

    if (isSetUserEnvironment()) {
      sb.append("userEnvironment:");
      if (this.userEnvironment == null) {
        sb.append("null");
      } else {
        sb.append(this.userEnvironment);
      }
      first = false;
    }
    if (isSetRawBuckConfig()) {
      if (!first) sb.append(", ");
      sb.append("rawBuckConfig:");
      if (this.rawBuckConfig == null) {
        sb.append("null");
      } else {
        sb.append(this.rawBuckConfig);
      }
      first = false;
    }
    if (isSetArchitecture()) {
      if (!first) sb.append(", ");
      sb.append("architecture:");
      if (this.architecture == null) {
        sb.append("null");
      } else {
        sb.append(this.architecture);
      }
      first = false;
    }
    if (isSetPlatform()) {
      if (!first) sb.append(", ");
      sb.append("platform:");
      if (this.platform == null) {
        sb.append("null");
      } else {
        sb.append(this.platform);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class BuildJobStateBuckConfigStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public BuildJobStateBuckConfigStandardScheme getScheme() {
      return new BuildJobStateBuckConfigStandardScheme();
    }
  }

  private static class BuildJobStateBuckConfigStandardScheme extends org.apache.thrift.scheme.StandardScheme<BuildJobStateBuckConfig> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, BuildJobStateBuckConfig struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // USER_ENVIRONMENT
            if (schemeField.type == org.apache.thrift.protocol.TType.MAP) {
              {
                org.apache.thrift.protocol.TMap _map0 = iprot.readMapBegin();
                struct.userEnvironment = new java.util.HashMap<java.lang.String,java.lang.String>(2*_map0.size);
                java.lang.String _key1;
                java.lang.String _val2;
                for (int _i3 = 0; _i3 < _map0.size; ++_i3)
                {
                  _key1 = iprot.readString();
                  _val2 = iprot.readString();
                  struct.userEnvironment.put(_key1, _val2);
                }
                iprot.readMapEnd();
              }
              struct.setUserEnvironmentIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // RAW_BUCK_CONFIG
            if (schemeField.type == org.apache.thrift.protocol.TType.MAP) {
              {
                org.apache.thrift.protocol.TMap _map4 = iprot.readMapBegin();
                struct.rawBuckConfig = new java.util.HashMap<java.lang.String,java.util.List<OrderedStringMapEntry>>(2*_map4.size);
                java.lang.String _key5;
                java.util.List<OrderedStringMapEntry> _val6;
                for (int _i7 = 0; _i7 < _map4.size; ++_i7)
                {
                  _key5 = iprot.readString();
                  {
                    org.apache.thrift.protocol.TList _list8 = iprot.readListBegin();
                    _val6 = new java.util.ArrayList<OrderedStringMapEntry>(_list8.size);
                    OrderedStringMapEntry _elem9;
                    for (int _i10 = 0; _i10 < _list8.size; ++_i10)
                    {
                      _elem9 = new OrderedStringMapEntry();
                      _elem9.read(iprot);
                      _val6.add(_elem9);
                    }
                    iprot.readListEnd();
                  }
                  struct.rawBuckConfig.put(_key5, _val6);
                }
                iprot.readMapEnd();
              }
              struct.setRawBuckConfigIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // ARCHITECTURE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.architecture = iprot.readString();
              struct.setArchitectureIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // PLATFORM
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.platform = iprot.readString();
              struct.setPlatformIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, BuildJobStateBuckConfig struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.userEnvironment != null) {
        if (struct.isSetUserEnvironment()) {
          oprot.writeFieldBegin(USER_ENVIRONMENT_FIELD_DESC);
          {
            oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRING, struct.userEnvironment.size()));
            for (java.util.Map.Entry<java.lang.String, java.lang.String> _iter11 : struct.userEnvironment.entrySet())
            {
              oprot.writeString(_iter11.getKey());
              oprot.writeString(_iter11.getValue());
            }
            oprot.writeMapEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      if (struct.rawBuckConfig != null) {
        if (struct.isSetRawBuckConfig()) {
          oprot.writeFieldBegin(RAW_BUCK_CONFIG_FIELD_DESC);
          {
            oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.LIST, struct.rawBuckConfig.size()));
            for (java.util.Map.Entry<java.lang.String, java.util.List<OrderedStringMapEntry>> _iter12 : struct.rawBuckConfig.entrySet())
            {
              oprot.writeString(_iter12.getKey());
              {
                oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, _iter12.getValue().size()));
                for (OrderedStringMapEntry _iter13 : _iter12.getValue())
                {
                  _iter13.write(oprot);
                }
                oprot.writeListEnd();
              }
            }
            oprot.writeMapEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      if (struct.architecture != null) {
        if (struct.isSetArchitecture()) {
          oprot.writeFieldBegin(ARCHITECTURE_FIELD_DESC);
          oprot.writeString(struct.architecture);
          oprot.writeFieldEnd();
        }
      }
      if (struct.platform != null) {
        if (struct.isSetPlatform()) {
          oprot.writeFieldBegin(PLATFORM_FIELD_DESC);
          oprot.writeString(struct.platform);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class BuildJobStateBuckConfigTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public BuildJobStateBuckConfigTupleScheme getScheme() {
      return new BuildJobStateBuckConfigTupleScheme();
    }
  }

  private static class BuildJobStateBuckConfigTupleScheme extends org.apache.thrift.scheme.TupleScheme<BuildJobStateBuckConfig> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, BuildJobStateBuckConfig struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetUserEnvironment()) {
        optionals.set(0);
      }
      if (struct.isSetRawBuckConfig()) {
        optionals.set(1);
      }
      if (struct.isSetArchitecture()) {
        optionals.set(2);
      }
      if (struct.isSetPlatform()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetUserEnvironment()) {
        {
          oprot.writeI32(struct.userEnvironment.size());
          for (java.util.Map.Entry<java.lang.String, java.lang.String> _iter14 : struct.userEnvironment.entrySet())
          {
            oprot.writeString(_iter14.getKey());
            oprot.writeString(_iter14.getValue());
          }
        }
      }
      if (struct.isSetRawBuckConfig()) {
        {
          oprot.writeI32(struct.rawBuckConfig.size());
          for (java.util.Map.Entry<java.lang.String, java.util.List<OrderedStringMapEntry>> _iter15 : struct.rawBuckConfig.entrySet())
          {
            oprot.writeString(_iter15.getKey());
            {
              oprot.writeI32(_iter15.getValue().size());
              for (OrderedStringMapEntry _iter16 : _iter15.getValue())
              {
                _iter16.write(oprot);
              }
            }
          }
        }
      }
      if (struct.isSetArchitecture()) {
        oprot.writeString(struct.architecture);
      }
      if (struct.isSetPlatform()) {
        oprot.writeString(struct.platform);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, BuildJobStateBuckConfig struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TMap _map17 = new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRING, iprot.readI32());
          struct.userEnvironment = new java.util.HashMap<java.lang.String,java.lang.String>(2*_map17.size);
          java.lang.String _key18;
          java.lang.String _val19;
          for (int _i20 = 0; _i20 < _map17.size; ++_i20)
          {
            _key18 = iprot.readString();
            _val19 = iprot.readString();
            struct.userEnvironment.put(_key18, _val19);
          }
        }
        struct.setUserEnvironmentIsSet(true);
      }
      if (incoming.get(1)) {
        {
          org.apache.thrift.protocol.TMap _map21 = new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.LIST, iprot.readI32());
          struct.rawBuckConfig = new java.util.HashMap<java.lang.String,java.util.List<OrderedStringMapEntry>>(2*_map21.size);
          java.lang.String _key22;
          java.util.List<OrderedStringMapEntry> _val23;
          for (int _i24 = 0; _i24 < _map21.size; ++_i24)
          {
            _key22 = iprot.readString();
            {
              org.apache.thrift.protocol.TList _list25 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
              _val23 = new java.util.ArrayList<OrderedStringMapEntry>(_list25.size);
              OrderedStringMapEntry _elem26;
              for (int _i27 = 0; _i27 < _list25.size; ++_i27)
              {
                _elem26 = new OrderedStringMapEntry();
                _elem26.read(iprot);
                _val23.add(_elem26);
              }
            }
            struct.rawBuckConfig.put(_key22, _val23);
          }
        }
        struct.setRawBuckConfigIsSet(true);
      }
      if (incoming.get(2)) {
        struct.architecture = iprot.readString();
        struct.setArchitectureIsSet(true);
      }
      if (incoming.get(3)) {
        struct.platform = iprot.readString();
        struct.setPlatformIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

