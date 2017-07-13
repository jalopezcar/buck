/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.facebook.buck.distributed.thrift;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2017-06-18")
public class BuildJobStateFileHashes implements org.apache.thrift.TBase<BuildJobStateFileHashes, BuildJobStateFileHashes._Fields>, java.io.Serializable, Cloneable, Comparable<BuildJobStateFileHashes> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("BuildJobStateFileHashes");

  private static final org.apache.thrift.protocol.TField CELL_INDEX_FIELD_DESC = new org.apache.thrift.protocol.TField("cellIndex", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField ENTRIES_FIELD_DESC = new org.apache.thrift.protocol.TField("entries", org.apache.thrift.protocol.TType.LIST, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new BuildJobStateFileHashesStandardSchemeFactory());
    schemes.put(TupleScheme.class, new BuildJobStateFileHashesTupleSchemeFactory());
  }

  public int cellIndex; // optional
  public List<BuildJobStateFileHashEntry> entries; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    CELL_INDEX((short)1, "cellIndex"),
    ENTRIES((short)2, "entries");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // CELL_INDEX
          return CELL_INDEX;
        case 2: // ENTRIES
          return ENTRIES;
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
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __CELLINDEX_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.CELL_INDEX,_Fields.ENTRIES};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.CELL_INDEX, new org.apache.thrift.meta_data.FieldMetaData("cellIndex", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.ENTRIES, new org.apache.thrift.meta_data.FieldMetaData("entries", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, BuildJobStateFileHashEntry.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(BuildJobStateFileHashes.class, metaDataMap);
  }

  public BuildJobStateFileHashes() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public BuildJobStateFileHashes(BuildJobStateFileHashes other) {
    __isset_bitfield = other.__isset_bitfield;
    this.cellIndex = other.cellIndex;
    if (other.isSetEntries()) {
      List<BuildJobStateFileHashEntry> __this__entries = new ArrayList<BuildJobStateFileHashEntry>(other.entries.size());
      for (BuildJobStateFileHashEntry other_element : other.entries) {
        __this__entries.add(new BuildJobStateFileHashEntry(other_element));
      }
      this.entries = __this__entries;
    }
  }

  public BuildJobStateFileHashes deepCopy() {
    return new BuildJobStateFileHashes(this);
  }

  @Override
  public void clear() {
    setCellIndexIsSet(false);
    this.cellIndex = 0;
    this.entries = null;
  }

  public int getCellIndex() {
    return this.cellIndex;
  }

  public BuildJobStateFileHashes setCellIndex(int cellIndex) {
    this.cellIndex = cellIndex;
    setCellIndexIsSet(true);
    return this;
  }

  public void unsetCellIndex() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __CELLINDEX_ISSET_ID);
  }

  /** Returns true if field cellIndex is set (has been assigned a value) and false otherwise */
  public boolean isSetCellIndex() {
    return EncodingUtils.testBit(__isset_bitfield, __CELLINDEX_ISSET_ID);
  }

  public void setCellIndexIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __CELLINDEX_ISSET_ID, value);
  }

  public int getEntriesSize() {
    return (this.entries == null) ? 0 : this.entries.size();
  }

  public java.util.Iterator<BuildJobStateFileHashEntry> getEntriesIterator() {
    return (this.entries == null) ? null : this.entries.iterator();
  }

  public void addToEntries(BuildJobStateFileHashEntry elem) {
    if (this.entries == null) {
      this.entries = new ArrayList<BuildJobStateFileHashEntry>();
    }
    this.entries.add(elem);
  }

  public List<BuildJobStateFileHashEntry> getEntries() {
    return this.entries;
  }

  public BuildJobStateFileHashes setEntries(List<BuildJobStateFileHashEntry> entries) {
    this.entries = entries;
    return this;
  }

  public void unsetEntries() {
    this.entries = null;
  }

  /** Returns true if field entries is set (has been assigned a value) and false otherwise */
  public boolean isSetEntries() {
    return this.entries != null;
  }

  public void setEntriesIsSet(boolean value) {
    if (!value) {
      this.entries = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case CELL_INDEX:
      if (value == null) {
        unsetCellIndex();
      } else {
        setCellIndex((Integer)value);
      }
      break;

    case ENTRIES:
      if (value == null) {
        unsetEntries();
      } else {
        setEntries((List<BuildJobStateFileHashEntry>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case CELL_INDEX:
      return getCellIndex();

    case ENTRIES:
      return getEntries();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case CELL_INDEX:
      return isSetCellIndex();
    case ENTRIES:
      return isSetEntries();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof BuildJobStateFileHashes)
      return this.equals((BuildJobStateFileHashes)that);
    return false;
  }

  public boolean equals(BuildJobStateFileHashes that) {
    if (that == null)
      return false;

    boolean this_present_cellIndex = true && this.isSetCellIndex();
    boolean that_present_cellIndex = true && that.isSetCellIndex();
    if (this_present_cellIndex || that_present_cellIndex) {
      if (!(this_present_cellIndex && that_present_cellIndex))
        return false;
      if (this.cellIndex != that.cellIndex)
        return false;
    }

    boolean this_present_entries = true && this.isSetEntries();
    boolean that_present_entries = true && that.isSetEntries();
    if (this_present_entries || that_present_entries) {
      if (!(this_present_entries && that_present_entries))
        return false;
      if (!this.entries.equals(that.entries))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_cellIndex = true && (isSetCellIndex());
    list.add(present_cellIndex);
    if (present_cellIndex)
      list.add(cellIndex);

    boolean present_entries = true && (isSetEntries());
    list.add(present_entries);
    if (present_entries)
      list.add(entries);

    return list.hashCode();
  }

  @Override
  public int compareTo(BuildJobStateFileHashes other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetCellIndex()).compareTo(other.isSetCellIndex());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCellIndex()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.cellIndex, other.cellIndex);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetEntries()).compareTo(other.isSetEntries());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetEntries()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.entries, other.entries);
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
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("BuildJobStateFileHashes(");
    boolean first = true;

    if (isSetCellIndex()) {
      sb.append("cellIndex:");
      sb.append(this.cellIndex);
      first = false;
    }
    if (isSetEntries()) {
      if (!first) sb.append(", ");
      sb.append("entries:");
      if (this.entries == null) {
        sb.append("null");
      } else {
        sb.append(this.entries);
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

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class BuildJobStateFileHashesStandardSchemeFactory implements SchemeFactory {
    public BuildJobStateFileHashesStandardScheme getScheme() {
      return new BuildJobStateFileHashesStandardScheme();
    }
  }

  private static class BuildJobStateFileHashesStandardScheme extends StandardScheme<BuildJobStateFileHashes> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, BuildJobStateFileHashes struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // CELL_INDEX
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.cellIndex = iprot.readI32();
              struct.setCellIndexIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // ENTRIES
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list54 = iprot.readListBegin();
                struct.entries = new ArrayList<BuildJobStateFileHashEntry>(_list54.size);
                BuildJobStateFileHashEntry _elem55;
                for (int _i56 = 0; _i56 < _list54.size; ++_i56)
                {
                  _elem55 = new BuildJobStateFileHashEntry();
                  _elem55.read(iprot);
                  struct.entries.add(_elem55);
                }
                iprot.readListEnd();
              }
              struct.setEntriesIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, BuildJobStateFileHashes struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.isSetCellIndex()) {
        oprot.writeFieldBegin(CELL_INDEX_FIELD_DESC);
        oprot.writeI32(struct.cellIndex);
        oprot.writeFieldEnd();
      }
      if (struct.entries != null) {
        if (struct.isSetEntries()) {
          oprot.writeFieldBegin(ENTRIES_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.entries.size()));
            for (BuildJobStateFileHashEntry _iter57 : struct.entries)
            {
              _iter57.write(oprot);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class BuildJobStateFileHashesTupleSchemeFactory implements SchemeFactory {
    public BuildJobStateFileHashesTupleScheme getScheme() {
      return new BuildJobStateFileHashesTupleScheme();
    }
  }

  private static class BuildJobStateFileHashesTupleScheme extends TupleScheme<BuildJobStateFileHashes> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, BuildJobStateFileHashes struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetCellIndex()) {
        optionals.set(0);
      }
      if (struct.isSetEntries()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetCellIndex()) {
        oprot.writeI32(struct.cellIndex);
      }
      if (struct.isSetEntries()) {
        {
          oprot.writeI32(struct.entries.size());
          for (BuildJobStateFileHashEntry _iter58 : struct.entries)
          {
            _iter58.write(oprot);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, BuildJobStateFileHashes struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.cellIndex = iprot.readI32();
        struct.setCellIndexIsSet(true);
      }
      if (incoming.get(1)) {
        {
          org.apache.thrift.protocol.TList _list59 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.entries = new ArrayList<BuildJobStateFileHashEntry>(_list59.size);
          BuildJobStateFileHashEntry _elem60;
          for (int _i61 = 0; _i61 < _list59.size; ++_i61)
          {
            _elem60 = new BuildJobStateFileHashEntry();
            _elem60.read(iprot);
            struct.entries.add(_elem60);
          }
        }
        struct.setEntriesIsSet(true);
      }
    }
  }

}

