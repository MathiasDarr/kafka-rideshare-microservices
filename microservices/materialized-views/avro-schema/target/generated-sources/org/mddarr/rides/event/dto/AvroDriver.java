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
public class AvroDriver extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 4316786793825761111L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"AvroDriver\",\"namespace\":\"org.mddarr.rides.event.dto\",\"fields\":[{\"name\":\"driverid\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"firstname\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"lastname\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"seats\",\"type\":\"int\"},{\"name\":\"state\",\"type\":{\"type\":\"enum\",\"name\":\"AvroDriverState\",\"symbols\":[\"INACTIVE\",\"ASSIGNED_RIDE\",\"COMPLETING_RIDE\",\"ACTIVE\"]}}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<AvroDriver> ENCODER =
      new BinaryMessageEncoder<AvroDriver>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<AvroDriver> DECODER =
      new BinaryMessageDecoder<AvroDriver>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<AvroDriver> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<AvroDriver> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<AvroDriver>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this AvroDriver to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a AvroDriver from a ByteBuffer. */
  public static AvroDriver fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

   private java.lang.String driverid;
   private java.lang.String firstname;
   private java.lang.String lastname;
   private int seats;
   private org.mddarr.rides.event.dto.AvroDriverState state;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public AvroDriver() {}

  /**
   * All-args constructor.
   * @param driverid The new value for driverid
   * @param firstname The new value for firstname
   * @param lastname The new value for lastname
   * @param seats The new value for seats
   * @param state The new value for state
   */
  public AvroDriver(java.lang.String driverid, java.lang.String firstname, java.lang.String lastname, java.lang.Integer seats, org.mddarr.rides.event.dto.AvroDriverState state) {
    this.driverid = driverid;
    this.firstname = firstname;
    this.lastname = lastname;
    this.seats = seats;
    this.state = state;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return driverid;
    case 1: return firstname;
    case 2: return lastname;
    case 3: return seats;
    case 4: return state;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: driverid = (java.lang.String)value$; break;
    case 1: firstname = (java.lang.String)value$; break;
    case 2: lastname = (java.lang.String)value$; break;
    case 3: seats = (java.lang.Integer)value$; break;
    case 4: state = (org.mddarr.rides.event.dto.AvroDriverState)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
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
   * Gets the value of the 'firstname' field.
   * @return The value of the 'firstname' field.
   */
  public java.lang.String getFirstname() {
    return firstname;
  }

  /**
   * Sets the value of the 'firstname' field.
   * @param value the value to set.
   */
  public void setFirstname(java.lang.String value) {
    this.firstname = value;
  }

  /**
   * Gets the value of the 'lastname' field.
   * @return The value of the 'lastname' field.
   */
  public java.lang.String getLastname() {
    return lastname;
  }

  /**
   * Sets the value of the 'lastname' field.
   * @param value the value to set.
   */
  public void setLastname(java.lang.String value) {
    this.lastname = value;
  }

  /**
   * Gets the value of the 'seats' field.
   * @return The value of the 'seats' field.
   */
  public java.lang.Integer getSeats() {
    return seats;
  }

  /**
   * Sets the value of the 'seats' field.
   * @param value the value to set.
   */
  public void setSeats(java.lang.Integer value) {
    this.seats = value;
  }

  /**
   * Gets the value of the 'state' field.
   * @return The value of the 'state' field.
   */
  public org.mddarr.rides.event.dto.AvroDriverState getState() {
    return state;
  }

  /**
   * Sets the value of the 'state' field.
   * @param value the value to set.
   */
  public void setState(org.mddarr.rides.event.dto.AvroDriverState value) {
    this.state = value;
  }

  /**
   * Creates a new AvroDriver RecordBuilder.
   * @return A new AvroDriver RecordBuilder
   */
  public static org.mddarr.rides.event.dto.AvroDriver.Builder newBuilder() {
    return new org.mddarr.rides.event.dto.AvroDriver.Builder();
  }

  /**
   * Creates a new AvroDriver RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new AvroDriver RecordBuilder
   */
  public static org.mddarr.rides.event.dto.AvroDriver.Builder newBuilder(org.mddarr.rides.event.dto.AvroDriver.Builder other) {
    return new org.mddarr.rides.event.dto.AvroDriver.Builder(other);
  }

  /**
   * Creates a new AvroDriver RecordBuilder by copying an existing AvroDriver instance.
   * @param other The existing instance to copy.
   * @return A new AvroDriver RecordBuilder
   */
  public static org.mddarr.rides.event.dto.AvroDriver.Builder newBuilder(org.mddarr.rides.event.dto.AvroDriver other) {
    return new org.mddarr.rides.event.dto.AvroDriver.Builder(other);
  }

  /**
   * RecordBuilder for AvroDriver instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<AvroDriver>
    implements org.apache.avro.data.RecordBuilder<AvroDriver> {

    private java.lang.String driverid;
    private java.lang.String firstname;
    private java.lang.String lastname;
    private int seats;
    private org.mddarr.rides.event.dto.AvroDriverState state;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(org.mddarr.rides.event.dto.AvroDriver.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.driverid)) {
        this.driverid = data().deepCopy(fields()[0].schema(), other.driverid);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.firstname)) {
        this.firstname = data().deepCopy(fields()[1].schema(), other.firstname);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.lastname)) {
        this.lastname = data().deepCopy(fields()[2].schema(), other.lastname);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.seats)) {
        this.seats = data().deepCopy(fields()[3].schema(), other.seats);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.state)) {
        this.state = data().deepCopy(fields()[4].schema(), other.state);
        fieldSetFlags()[4] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing AvroDriver instance
     * @param other The existing instance to copy.
     */
    private Builder(org.mddarr.rides.event.dto.AvroDriver other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.driverid)) {
        this.driverid = data().deepCopy(fields()[0].schema(), other.driverid);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.firstname)) {
        this.firstname = data().deepCopy(fields()[1].schema(), other.firstname);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.lastname)) {
        this.lastname = data().deepCopy(fields()[2].schema(), other.lastname);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.seats)) {
        this.seats = data().deepCopy(fields()[3].schema(), other.seats);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.state)) {
        this.state = data().deepCopy(fields()[4].schema(), other.state);
        fieldSetFlags()[4] = true;
      }
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
    public org.mddarr.rides.event.dto.AvroDriver.Builder setDriverid(java.lang.String value) {
      validate(fields()[0], value);
      this.driverid = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'driverid' field has been set.
      * @return True if the 'driverid' field has been set, false otherwise.
      */
    public boolean hasDriverid() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'driverid' field.
      * @return This builder.
      */
    public org.mddarr.rides.event.dto.AvroDriver.Builder clearDriverid() {
      driverid = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'firstname' field.
      * @return The value.
      */
    public java.lang.String getFirstname() {
      return firstname;
    }

    /**
      * Sets the value of the 'firstname' field.
      * @param value The value of 'firstname'.
      * @return This builder.
      */
    public org.mddarr.rides.event.dto.AvroDriver.Builder setFirstname(java.lang.String value) {
      validate(fields()[1], value);
      this.firstname = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'firstname' field has been set.
      * @return True if the 'firstname' field has been set, false otherwise.
      */
    public boolean hasFirstname() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'firstname' field.
      * @return This builder.
      */
    public org.mddarr.rides.event.dto.AvroDriver.Builder clearFirstname() {
      firstname = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'lastname' field.
      * @return The value.
      */
    public java.lang.String getLastname() {
      return lastname;
    }

    /**
      * Sets the value of the 'lastname' field.
      * @param value The value of 'lastname'.
      * @return This builder.
      */
    public org.mddarr.rides.event.dto.AvroDriver.Builder setLastname(java.lang.String value) {
      validate(fields()[2], value);
      this.lastname = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'lastname' field has been set.
      * @return True if the 'lastname' field has been set, false otherwise.
      */
    public boolean hasLastname() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'lastname' field.
      * @return This builder.
      */
    public org.mddarr.rides.event.dto.AvroDriver.Builder clearLastname() {
      lastname = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'seats' field.
      * @return The value.
      */
    public java.lang.Integer getSeats() {
      return seats;
    }

    /**
      * Sets the value of the 'seats' field.
      * @param value The value of 'seats'.
      * @return This builder.
      */
    public org.mddarr.rides.event.dto.AvroDriver.Builder setSeats(int value) {
      validate(fields()[3], value);
      this.seats = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'seats' field has been set.
      * @return True if the 'seats' field has been set, false otherwise.
      */
    public boolean hasSeats() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'seats' field.
      * @return This builder.
      */
    public org.mddarr.rides.event.dto.AvroDriver.Builder clearSeats() {
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'state' field.
      * @return The value.
      */
    public org.mddarr.rides.event.dto.AvroDriverState getState() {
      return state;
    }

    /**
      * Sets the value of the 'state' field.
      * @param value The value of 'state'.
      * @return This builder.
      */
    public org.mddarr.rides.event.dto.AvroDriver.Builder setState(org.mddarr.rides.event.dto.AvroDriverState value) {
      validate(fields()[4], value);
      this.state = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'state' field has been set.
      * @return True if the 'state' field has been set, false otherwise.
      */
    public boolean hasState() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'state' field.
      * @return This builder.
      */
    public org.mddarr.rides.event.dto.AvroDriver.Builder clearState() {
      state = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public AvroDriver build() {
      try {
        AvroDriver record = new AvroDriver();
        record.driverid = fieldSetFlags()[0] ? this.driverid : (java.lang.String) defaultValue(fields()[0]);
        record.firstname = fieldSetFlags()[1] ? this.firstname : (java.lang.String) defaultValue(fields()[1]);
        record.lastname = fieldSetFlags()[2] ? this.lastname : (java.lang.String) defaultValue(fields()[2]);
        record.seats = fieldSetFlags()[3] ? this.seats : (java.lang.Integer) defaultValue(fields()[3]);
        record.state = fieldSetFlags()[4] ? this.state : (org.mddarr.rides.event.dto.AvroDriverState) defaultValue(fields()[4]);
        return record;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<AvroDriver>
    WRITER$ = (org.apache.avro.io.DatumWriter<AvroDriver>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<AvroDriver>
    READER$ = (org.apache.avro.io.DatumReader<AvroDriver>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}
