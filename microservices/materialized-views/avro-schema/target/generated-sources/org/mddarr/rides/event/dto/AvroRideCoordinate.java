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
public class AvroRideCoordinate extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 3081539143858097997L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"AvroRideCoordinate\",\"namespace\":\"org.mddarr.rides.event.dto\",\"fields\":[{\"name\":\"eventime\",\"type\":\"long\"},{\"name\":\"latitude\",\"type\":\"double\"},{\"name\":\"longitude\",\"type\":\"double\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<AvroRideCoordinate> ENCODER =
      new BinaryMessageEncoder<AvroRideCoordinate>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<AvroRideCoordinate> DECODER =
      new BinaryMessageDecoder<AvroRideCoordinate>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<AvroRideCoordinate> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<AvroRideCoordinate> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<AvroRideCoordinate>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this AvroRideCoordinate to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a AvroRideCoordinate from a ByteBuffer. */
  public static AvroRideCoordinate fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

   private long eventime;
   private double latitude;
   private double longitude;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public AvroRideCoordinate() {}

  /**
   * All-args constructor.
   * @param eventime The new value for eventime
   * @param latitude The new value for latitude
   * @param longitude The new value for longitude
   */
  public AvroRideCoordinate(java.lang.Long eventime, java.lang.Double latitude, java.lang.Double longitude) {
    this.eventime = eventime;
    this.latitude = latitude;
    this.longitude = longitude;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return eventime;
    case 1: return latitude;
    case 2: return longitude;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: eventime = (java.lang.Long)value$; break;
    case 1: latitude = (java.lang.Double)value$; break;
    case 2: longitude = (java.lang.Double)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'eventime' field.
   * @return The value of the 'eventime' field.
   */
  public java.lang.Long getEventime() {
    return eventime;
  }

  /**
   * Sets the value of the 'eventime' field.
   * @param value the value to set.
   */
  public void setEventime(java.lang.Long value) {
    this.eventime = value;
  }

  /**
   * Gets the value of the 'latitude' field.
   * @return The value of the 'latitude' field.
   */
  public java.lang.Double getLatitude() {
    return latitude;
  }

  /**
   * Sets the value of the 'latitude' field.
   * @param value the value to set.
   */
  public void setLatitude(java.lang.Double value) {
    this.latitude = value;
  }

  /**
   * Gets the value of the 'longitude' field.
   * @return The value of the 'longitude' field.
   */
  public java.lang.Double getLongitude() {
    return longitude;
  }

  /**
   * Sets the value of the 'longitude' field.
   * @param value the value to set.
   */
  public void setLongitude(java.lang.Double value) {
    this.longitude = value;
  }

  /**
   * Creates a new AvroRideCoordinate RecordBuilder.
   * @return A new AvroRideCoordinate RecordBuilder
   */
  public static org.mddarr.rides.event.dto.AvroRideCoordinate.Builder newBuilder() {
    return new org.mddarr.rides.event.dto.AvroRideCoordinate.Builder();
  }

  /**
   * Creates a new AvroRideCoordinate RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new AvroRideCoordinate RecordBuilder
   */
  public static org.mddarr.rides.event.dto.AvroRideCoordinate.Builder newBuilder(org.mddarr.rides.event.dto.AvroRideCoordinate.Builder other) {
    return new org.mddarr.rides.event.dto.AvroRideCoordinate.Builder(other);
  }

  /**
   * Creates a new AvroRideCoordinate RecordBuilder by copying an existing AvroRideCoordinate instance.
   * @param other The existing instance to copy.
   * @return A new AvroRideCoordinate RecordBuilder
   */
  public static org.mddarr.rides.event.dto.AvroRideCoordinate.Builder newBuilder(org.mddarr.rides.event.dto.AvroRideCoordinate other) {
    return new org.mddarr.rides.event.dto.AvroRideCoordinate.Builder(other);
  }

  /**
   * RecordBuilder for AvroRideCoordinate instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<AvroRideCoordinate>
    implements org.apache.avro.data.RecordBuilder<AvroRideCoordinate> {

    private long eventime;
    private double latitude;
    private double longitude;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(org.mddarr.rides.event.dto.AvroRideCoordinate.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.eventime)) {
        this.eventime = data().deepCopy(fields()[0].schema(), other.eventime);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.latitude)) {
        this.latitude = data().deepCopy(fields()[1].schema(), other.latitude);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.longitude)) {
        this.longitude = data().deepCopy(fields()[2].schema(), other.longitude);
        fieldSetFlags()[2] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing AvroRideCoordinate instance
     * @param other The existing instance to copy.
     */
    private Builder(org.mddarr.rides.event.dto.AvroRideCoordinate other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.eventime)) {
        this.eventime = data().deepCopy(fields()[0].schema(), other.eventime);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.latitude)) {
        this.latitude = data().deepCopy(fields()[1].schema(), other.latitude);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.longitude)) {
        this.longitude = data().deepCopy(fields()[2].schema(), other.longitude);
        fieldSetFlags()[2] = true;
      }
    }

    /**
      * Gets the value of the 'eventime' field.
      * @return The value.
      */
    public java.lang.Long getEventime() {
      return eventime;
    }

    /**
      * Sets the value of the 'eventime' field.
      * @param value The value of 'eventime'.
      * @return This builder.
      */
    public org.mddarr.rides.event.dto.AvroRideCoordinate.Builder setEventime(long value) {
      validate(fields()[0], value);
      this.eventime = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'eventime' field has been set.
      * @return True if the 'eventime' field has been set, false otherwise.
      */
    public boolean hasEventime() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'eventime' field.
      * @return This builder.
      */
    public org.mddarr.rides.event.dto.AvroRideCoordinate.Builder clearEventime() {
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'latitude' field.
      * @return The value.
      */
    public java.lang.Double getLatitude() {
      return latitude;
    }

    /**
      * Sets the value of the 'latitude' field.
      * @param value The value of 'latitude'.
      * @return This builder.
      */
    public org.mddarr.rides.event.dto.AvroRideCoordinate.Builder setLatitude(double value) {
      validate(fields()[1], value);
      this.latitude = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'latitude' field has been set.
      * @return True if the 'latitude' field has been set, false otherwise.
      */
    public boolean hasLatitude() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'latitude' field.
      * @return This builder.
      */
    public org.mddarr.rides.event.dto.AvroRideCoordinate.Builder clearLatitude() {
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'longitude' field.
      * @return The value.
      */
    public java.lang.Double getLongitude() {
      return longitude;
    }

    /**
      * Sets the value of the 'longitude' field.
      * @param value The value of 'longitude'.
      * @return This builder.
      */
    public org.mddarr.rides.event.dto.AvroRideCoordinate.Builder setLongitude(double value) {
      validate(fields()[2], value);
      this.longitude = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'longitude' field has been set.
      * @return True if the 'longitude' field has been set, false otherwise.
      */
    public boolean hasLongitude() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'longitude' field.
      * @return This builder.
      */
    public org.mddarr.rides.event.dto.AvroRideCoordinate.Builder clearLongitude() {
      fieldSetFlags()[2] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public AvroRideCoordinate build() {
      try {
        AvroRideCoordinate record = new AvroRideCoordinate();
        record.eventime = fieldSetFlags()[0] ? this.eventime : (java.lang.Long) defaultValue(fields()[0]);
        record.latitude = fieldSetFlags()[1] ? this.latitude : (java.lang.Double) defaultValue(fields()[1]);
        record.longitude = fieldSetFlags()[2] ? this.longitude : (java.lang.Double) defaultValue(fields()[2]);
        return record;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<AvroRideCoordinate>
    WRITER$ = (org.apache.avro.io.DatumWriter<AvroRideCoordinate>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<AvroRideCoordinate>
    READER$ = (org.apache.avro.io.DatumReader<AvroRideCoordinate>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}
