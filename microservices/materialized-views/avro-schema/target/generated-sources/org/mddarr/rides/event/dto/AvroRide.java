/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package org.mddarr.rides.event.dto;

import org.apache.avro.specific.SpecificData;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class AvroRide extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -5588285444399958546L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"AvroRide\",\"namespace\":\"org.mddarr.rides.event.dto\",\"fields\":[{\"name\":\"rideid\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"userid\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"driverid\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<AvroRide> ENCODER =
      new BinaryMessageEncoder<AvroRide>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<AvroRide> DECODER =
      new BinaryMessageDecoder<AvroRide>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<AvroRide> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<AvroRide> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<AvroRide>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this AvroRide to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a AvroRide from a ByteBuffer. */
  public static AvroRide fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

   private java.lang.String rideid;
   private java.lang.String userid;
   private java.lang.String driverid;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public AvroRide() {}

  /**
   * All-args constructor.
   * @param rideid The new value for rideid
   * @param userid The new value for userid
   * @param driverid The new value for driverid
   */
  public AvroRide(java.lang.String rideid, java.lang.String userid, java.lang.String driverid) {
    this.rideid = rideid;
    this.userid = userid;
    this.driverid = driverid;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return rideid;
    case 1: return userid;
    case 2: return driverid;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: rideid = (java.lang.String)value$; break;
    case 1: userid = (java.lang.String)value$; break;
    case 2: driverid = (java.lang.String)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'rideid' field.
   * @return The value of the 'rideid' field.
   */
  public java.lang.String getRideid() {
    return rideid;
  }

  /**
   * Sets the value of the 'rideid' field.
   * @param value the value to set.
   */
  public void setRideid(java.lang.String value) {
    this.rideid = value;
  }

  /**
   * Gets the value of the 'userid' field.
   * @return The value of the 'userid' field.
   */
  public java.lang.String getUserid() {
    return userid;
  }

  /**
   * Sets the value of the 'userid' field.
   * @param value the value to set.
   */
  public void setUserid(java.lang.String value) {
    this.userid = value;
  }

  /**
   * Gets the value of the 'driverid' field.
   * @return The value of the 'driverid' field.
   */
  public java.lang.String getDriverid() {
    return driverid;
  }

  /**
   * Sets the value of the 'driverid' field.
   * @param value the value to set.
   */
  public void setDriverid(java.lang.String value) {
    this.driverid = value;
  }

  /**
   * Creates a new AvroRide RecordBuilder.
   * @return A new AvroRide RecordBuilder
   */
  public static org.mddarr.rides.event.dto.AvroRide.Builder newBuilder() {
    return new org.mddarr.rides.event.dto.AvroRide.Builder();
  }

  /**
   * Creates a new AvroRide RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new AvroRide RecordBuilder
   */
  public static org.mddarr.rides.event.dto.AvroRide.Builder newBuilder(org.mddarr.rides.event.dto.AvroRide.Builder other) {
    return new org.mddarr.rides.event.dto.AvroRide.Builder(other);
  }

  /**
   * Creates a new AvroRide RecordBuilder by copying an existing AvroRide instance.
   * @param other The existing instance to copy.
   * @return A new AvroRide RecordBuilder
   */
  public static org.mddarr.rides.event.dto.AvroRide.Builder newBuilder(org.mddarr.rides.event.dto.AvroRide other) {
    return new org.mddarr.rides.event.dto.AvroRide.Builder(other);
  }

  /**
   * RecordBuilder for AvroRide instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<AvroRide>
    implements org.apache.avro.data.RecordBuilder<AvroRide> {

    private java.lang.String rideid;
    private java.lang.String userid;
    private java.lang.String driverid;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(org.mddarr.rides.event.dto.AvroRide.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.rideid)) {
        this.rideid = data().deepCopy(fields()[0].schema(), other.rideid);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.userid)) {
        this.userid = data().deepCopy(fields()[1].schema(), other.userid);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.driverid)) {
        this.driverid = data().deepCopy(fields()[2].schema(), other.driverid);
        fieldSetFlags()[2] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing AvroRide instance
     * @param other The existing instance to copy.
     */
    private Builder(org.mddarr.rides.event.dto.AvroRide other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.rideid)) {
        this.rideid = data().deepCopy(fields()[0].schema(), other.rideid);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.userid)) {
        this.userid = data().deepCopy(fields()[1].schema(), other.userid);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.driverid)) {
        this.driverid = data().deepCopy(fields()[2].schema(), other.driverid);
        fieldSetFlags()[2] = true;
      }
    }

    /**
      * Gets the value of the 'rideid' field.
      * @return The value.
      */
    public java.lang.String getRideid() {
      return rideid;
    }

    /**
      * Sets the value of the 'rideid' field.
      * @param value The value of 'rideid'.
      * @return This builder.
      */
    public org.mddarr.rides.event.dto.AvroRide.Builder setRideid(java.lang.String value) {
      validate(fields()[0], value);
      this.rideid = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'rideid' field has been set.
      * @return True if the 'rideid' field has been set, false otherwise.
      */
    public boolean hasRideid() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'rideid' field.
      * @return This builder.
      */
    public org.mddarr.rides.event.dto.AvroRide.Builder clearRideid() {
      rideid = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'userid' field.
      * @return The value.
      */
    public java.lang.String getUserid() {
      return userid;
    }

    /**
      * Sets the value of the 'userid' field.
      * @param value The value of 'userid'.
      * @return This builder.
      */
    public org.mddarr.rides.event.dto.AvroRide.Builder setUserid(java.lang.String value) {
      validate(fields()[1], value);
      this.userid = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'userid' field has been set.
      * @return True if the 'userid' field has been set, false otherwise.
      */
    public boolean hasUserid() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'userid' field.
      * @return This builder.
      */
    public org.mddarr.rides.event.dto.AvroRide.Builder clearUserid() {
      userid = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'driverid' field.
      * @return The value.
      */
    public java.lang.String getDriverid() {
      return driverid;
    }

    /**
      * Sets the value of the 'driverid' field.
      * @param value The value of 'driverid'.
      * @return This builder.
      */
    public org.mddarr.rides.event.dto.AvroRide.Builder setDriverid(java.lang.String value) {
      validate(fields()[2], value);
      this.driverid = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'driverid' field has been set.
      * @return True if the 'driverid' field has been set, false otherwise.
      */
    public boolean hasDriverid() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'driverid' field.
      * @return This builder.
      */
    public org.mddarr.rides.event.dto.AvroRide.Builder clearDriverid() {
      driverid = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public AvroRide build() {
      try {
        AvroRide record = new AvroRide();
        record.rideid = fieldSetFlags()[0] ? this.rideid : (java.lang.String) defaultValue(fields()[0]);
        record.userid = fieldSetFlags()[1] ? this.userid : (java.lang.String) defaultValue(fields()[1]);
        record.driverid = fieldSetFlags()[2] ? this.driverid : (java.lang.String) defaultValue(fields()[2]);
        return record;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<AvroRide>
    WRITER$ = (org.apache.avro.io.DatumWriter<AvroRide>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<AvroRide>
    READER$ = (org.apache.avro.io.DatumReader<AvroRide>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}