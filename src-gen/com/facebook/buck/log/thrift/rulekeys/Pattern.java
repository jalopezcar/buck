/**
 * Autogenerated by Thrift Compiler (0.10.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.facebook.buck.log.thrift.rulekeys;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
public class Pattern implements org.apache.thrift.TBase<Pattern, Pattern._Fields>, java.io.Serializable, Cloneable, Comparable<Pattern> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Pattern");

  private static final org.apache.thrift.protocol.TField PATTERN_FIELD_DESC = new org.apache.thrift.protocol.TField("pattern", org.apache.thrift.protocol.TType.STRING, (short)1);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new PatternStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new PatternTupleSchemeFactory();

  public java.lang.String pattern; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    PATTERN((short)1, "pattern");

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
        case 1: // PATTERN
          return PATTERN;
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
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.PATTERN, new org.apache.thrift.meta_data.FieldMetaData("pattern", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Pattern.class, metaDataMap);
  }

  public Pattern() {
  }

  public Pattern(
    java.lang.String pattern)
  {
    this();
    this.pattern = pattern;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Pattern(Pattern other) {
    if (other.isSetPattern()) {
      this.pattern = other.pattern;
    }
  }

  public Pattern deepCopy() {
    return new Pattern(this);
  }

  @Override
  public void clear() {
    this.pattern = null;
  }

  public java.lang.String getPattern() {
    return this.pattern;
  }

  public Pattern setPattern(java.lang.String pattern) {
    this.pattern = pattern;
    return this;
  }

  public void unsetPattern() {
    this.pattern = null;
  }

  /** Returns true if field pattern is set (has been assigned a value) and false otherwise */
  public boolean isSetPattern() {
    return this.pattern != null;
  }

  public void setPatternIsSet(boolean value) {
    if (!value) {
      this.pattern = null;
    }
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case PATTERN:
      if (value == null) {
        unsetPattern();
      } else {
        setPattern((java.lang.String)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case PATTERN:
      return getPattern();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case PATTERN:
      return isSetPattern();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof Pattern)
      return this.equals((Pattern)that);
    return false;
  }

  public boolean equals(Pattern that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_pattern = true && this.isSetPattern();
    boolean that_present_pattern = true && that.isSetPattern();
    if (this_present_pattern || that_present_pattern) {
      if (!(this_present_pattern && that_present_pattern))
        return false;
      if (!this.pattern.equals(that.pattern))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetPattern()) ? 131071 : 524287);
    if (isSetPattern())
      hashCode = hashCode * 8191 + pattern.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(Pattern other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetPattern()).compareTo(other.isSetPattern());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPattern()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.pattern, other.pattern);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("Pattern(");
    boolean first = true;

    sb.append("pattern:");
    if (this.pattern == null) {
      sb.append("null");
    } else {
      sb.append(this.pattern);
    }
    first = false;
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

  private static class PatternStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public PatternStandardScheme getScheme() {
      return new PatternStandardScheme();
    }
  }

  private static class PatternStandardScheme extends org.apache.thrift.scheme.StandardScheme<Pattern> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, Pattern struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // PATTERN
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.pattern = iprot.readString();
              struct.setPatternIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, Pattern struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.pattern != null) {
        oprot.writeFieldBegin(PATTERN_FIELD_DESC);
        oprot.writeString(struct.pattern);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class PatternTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public PatternTupleScheme getScheme() {
      return new PatternTupleScheme();
    }
  }

  private static class PatternTupleScheme extends org.apache.thrift.scheme.TupleScheme<Pattern> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, Pattern struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetPattern()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetPattern()) {
        oprot.writeString(struct.pattern);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, Pattern struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        struct.pattern = iprot.readString();
        struct.setPatternIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

