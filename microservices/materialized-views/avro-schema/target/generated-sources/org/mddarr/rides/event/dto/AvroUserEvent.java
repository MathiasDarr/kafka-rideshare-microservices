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
public class AvroUserEvent extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -7829279595310602947L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"AvroUserEvent\",\"namespace\":\"org.mddarr.rides.event.dto\",\"fields\":[{\"name\":\"userid\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}]},{\"name\":\"firstname\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"lastname\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"phonenumber\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"city\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"email\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"type\",\"type\":{\"type\":\"enum\",\"name\":\"AvroUserEventType\",\"symbols\":[\"REGISTRAIION_PENDING\",\"REISTERED\",\"REGISTRATION_FAILED\"]}}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<AvroUserEvent> ENCODER =
      new BinaryMessageEncoder<AvroUserEvent>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<AvroUserEvent> DECODER =
      new BinaryMessageDecoder<AvroUserEvent>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<AvroUserEvent> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<AvroUserEvent> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<AvroUserEvent>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this AvroUserEvent to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a AvroUserEvent from a ByteBuffer. */
  public static AvroUserEvent fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

   private java.lang.String userid;
   private java.lang.String firstname;
   private java.lang.String lastname;
   private java.lang.String phonenumber;
   private java.lang.String city;
   private java.lang.String email;
   private org.mddarr.rides.event.dto.AvroUserEventType type;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public AvroUserEvent() {}

  /**
   * All-args constructor.
   * @param userid The new value for userid
   * @param firstname The new value for firstname
   * @param lastname The new value for lastname
   * @param phonenumber The new value for phonenumber
   * @param city The new value for city
   * @param email The new value for email
   * @param type The new value for type
   */
  public AvroUserEvent(java.lang.String userid, java.lang.String firstname, java.lang.String lastname, java.lang.String phonenumber, java.lang.String city, java.lang.String email, org.mddarr.rides.event.dto.AvroUserEventType type) {
    this.userid = userid;
    this.firstname = firstname;
    this.lastname = lastname;
    this.phonenumber = phonenumber;
    this.city = city;
    this.email = email;
    this.type = type;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return userid;
    case 1: return firstname;
    case 2: return lastname;
    case 3: return phonenumber;
    case 4: return city;
    case 5: return email;
    case 6: return type;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: userid = (java.lang.String)value$; break;
    case 1: firstname = (java.lang.String)value$; break;
    case 2: lastname = (java.lang.String)value$; break;
    case 3: phonenumber = (java.lang.String)value$; break;
    case 4: city = (java.lang.String)value$; break;
    case 5: email = (java.lang.String)value$; break;
    case 6: type = (org.mddarr.rides.event.dto.AvroUserEventType)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
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
   * Gets the value of the 'phonenumber' field.
   * @return The value of the 'phonenumber' field.
   */
  public java.lang.String getPhonenumber() {
    return phonenumber;
  }

  /**
   * Sets the value of the 'phonenumber' field.
   * @param value the value to set.
   */
  public void setPhonenumber(java.lang.String value) {
    this.phonenumber = value;
  }

  /**
   * Gets the value of the 'city' field.
   * @return The value of the 'city' field.
   */
  public java.lang.String getCity() {
    return city;
  }

  /**
   * Sets the value of the 'city' field.
   * @param value the value to set.
   */
  public void setCity(java.lang.String value) {
    this.city = value;
  }

  /**
   * Gets the value of the 'email' field.
   * @return The value of the 'email' field.
   */
  public java.lang.String getEmail() {
    return email;
  }

  /**
   * Sets the value of the 'email' field.
   * @param value the value to set.
   */
  public void setEmail(java.lang.String value) {
    this.email = value;
  }

  /**
   * Gets the value of the 'type' field.
   * @return The value of the 'type' field.
   */
  public org.mddarr.rides.event.dto.AvroUserEventType getType() {
    return type;
  }

  /**
   * Sets the value of the 'type' field.
   * @param value the value to set.
   */
  public void setType(org.mddarr.rides.event.dto.AvroUserEventType value) {
    this.type = value;
  }

  /**
   * Creates a new AvroUserEvent RecordBuilder.
   * @return A new AvroUserEvent RecordBuilder
   */
  public static org.mddarr.rides.event.dto.AvroUserEvent.Builder newBuilder() {
    return new org.mddarr.rides.event.dto.AvroUserEvent.Builder();
  }

  /**
   * Creates a new AvroUserEvent RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new AvroUserEvent RecordBuilder
   */
  public static org.mddarr.rides.event.dto.AvroUserEvent.Builder newBuilder(org.mddarr.rides.event.dto.AvroUserEvent.Builder other) {
    return new org.mddarr.rides.event.dto.AvroUserEvent.Builder(other);
  }

  /**
   * Creates a new AvroUserEvent RecordBuilder by copying an existing AvroUserEvent instance.
   * @param other The existing instance to copy.
   * @return A new AvroUserEvent RecordBuilder
   */
  public static org.mddarr.rides.event.dto.AvroUserEvent.Builder newBuilder(org.mddarr.rides.event.dto.AvroUserEvent other) {
    return new org.mddarr.rides.event.dto.AvroUserEvent.Builder(other);
  }

  /**
   * RecordBuilder for AvroUserEvent instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<AvroUserEvent>
    implements org.apache.avro.data.RecordBuilder<AvroUserEvent> {

    private java.lang.String userid;
    private java.lang.String firstname;
    private java.lang.String lastname;
    private java.lang.String phonenumber;
    private java.lang.String city;
    private java.lang.String email;
    private org.mddarr.rides.event.dto.AvroUserEventType type;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(org.mddarr.rides.event.dto.AvroUserEvent.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.userid)) {
        this.userid = data().deepCopy(fields()[0].schema(), other.userid);
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
      if (isValidValue(fields()[3], other.phonenumber)) {
        this.phonenumber = data().deepCopy(fields()[3].schema(), other.phonenumber);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.city)) {
        this.city = data().deepCopy(fields()[4].schema(), other.city);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.email)) {
        this.email = data().deepCopy(fields()[5].schema(), other.email);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.type)) {
        this.type = data().deepCopy(fields()[6].schema(), other.type);
        fieldSetFlags()[6] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing AvroUserEvent instance
     * @param other The existing instance to copy.
     */
    private Builder(org.mddarr.rides.event.dto.AvroUserEvent other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.userid)) {
        this.userid = data().deepCopy(fields()[0].schema(), other.userid);
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
      if (isValidValue(fields()[3], other.phonenumber)) {
        this.phonenumber = data().deepCopy(fields()[3].schema(), other.phonenumber);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.city)) {
        this.city = data().deepCopy(fields()[4].schema(), other.city);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.email)) {
        this.email = data().deepCopy(fields()[5].schema(), other.email);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.type)) {
        this.type = data().deepCopy(fields()[6].schema(), other.type);
        fieldSetFlags()[6] = true;
      }
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
    public org.mddarr.rides.event.dto.AvroUserEvent.Builder setUserid(java.lang.String value) {
      validate(fields()[0], value);
      this.userid = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'userid' field has been set.
      * @return True if the 'userid' field has been set, false otherwise.
      */
    public boolean hasUserid() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'userid' field.
      * @return This builder.
      */
    public org.mddarr.rides.event.dto.AvroUserEvent.Builder clearUserid() {
      userid = null;
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
    public org.mddarr.rides.event.dto.AvroUserEvent.Builder setFirstname(java.lang.String value) {
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
    public org.mddarr.rides.event.dto.AvroUserEvent.Builder clearFirstname() {
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
    public org.mddarr.rides.event.dto.AvroUserEvent.Builder setLastname(java.lang.String value) {
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
    public org.mddarr.rides.event.dto.AvroUserEvent.Builder clearLastname() {
      lastname = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'phonenumber' field.
      * @return The value.
      */
    public java.lang.String getPhonenumber() {
      return phonenumber;
    }

    /**
      * Sets the value of the 'phonenumber' field.
      * @param value The value of 'phonenumber'.
      * @return This builder.
      */
    public org.mddarr.rides.event.dto.AvroUserEvent.Builder setPhonenumber(java.lang.String value) {
      validate(fields()[3], value);
      this.phonenumber = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'phonenumber' field has been set.
      * @return True if the 'phonenumber' field has been set, false otherwise.
      */
    public boolean hasPhonenumber() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'phonenumber' field.
      * @return This builder.
      */
    public org.mddarr.rides.event.dto.AvroUserEvent.Builder clearPhonenumber() {
      phonenumber = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'city' field.
      * @return The value.
      */
    public java.lang.String getCity() {
      return city;
    }

    /**
      * Sets the value of the 'city' field.
      * @param value The value of 'city'.
      * @return This builder.
      */
    public org.mddarr.rides.event.dto.AvroUserEvent.Builder setCity(java.lang.String value) {
      validate(fields()[4], value);
      this.city = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'city' field has been set.
      * @return True if the 'city' field has been set, false otherwise.
      */
    public boolean hasCity() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'city' field.
      * @return This builder.
      */
    public org.mddarr.rides.event.dto.AvroUserEvent.Builder clearCity() {
      city = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /**
      * Gets the value of the 'email' field.
      * @return The value.
      */
    public java.lang.String getEmail() {
      return email;
    }

    /**
      * Sets the value of the 'email' field.
      * @param value The value of 'email'.
      * @return This builder.
      */
    public org.mddarr.rides.event.dto.AvroUserEvent.Builder setEmail(java.lang.String value) {
      validate(fields()[5], value);
      this.email = value;
      fieldSetFlags()[5] = true;
      return this;
    }

    /**
      * Checks whether the 'email' field has been set.
      * @return True if the 'email' field has been set, false otherwise.
      */
    public boolean hasEmail() {
      return fieldSetFlags()[5];
    }


    /**
      * Clears the value of the 'email' field.
      * @return This builder.
      */
    public org.mddarr.rides.event.dto.AvroUserEvent.Builder clearEmail() {
      email = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    /**
      * Gets the value of the 'type' field.
      * @return The value.
      */
    public org.mddarr.rides.event.dto.AvroUserEventType getType() {
      return type;
    }

    /**
      * Sets the value of the 'type' field.
      * @param value The value of 'type'.
      * @return This builder.
      */
    public org.mddarr.rides.event.dto.AvroUserEvent.Builder setType(org.mddarr.rides.event.dto.AvroUserEventType value) {
      validate(fields()[6], value);
      this.type = value;
      fieldSetFlags()[6] = true;
      return this;
    }

    /**
      * Checks whether the 'type' field has been set.
      * @return True if the 'type' field has been set, false otherwise.
      */
    public boolean hasType() {
      return fieldSetFlags()[6];
    }


    /**
      * Clears the value of the 'type' field.
      * @return This builder.
      */
    public org.mddarr.rides.event.dto.AvroUserEvent.Builder clearType() {
      type = null;
      fieldSetFlags()[6] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public AvroUserEvent build() {
      try {
        AvroUserEvent record = new AvroUserEvent();
        record.userid = fieldSetFlags()[0] ? this.userid : (java.lang.String) defaultValue(fields()[0]);
        record.firstname = fieldSetFlags()[1] ? this.firstname : (java.lang.String) defaultValue(fields()[1]);
        record.lastname = fieldSetFlags()[2] ? this.lastname : (java.lang.String) defaultValue(fields()[2]);
        record.phonenumber = fieldSetFlags()[3] ? this.phonenumber : (java.lang.String) defaultValue(fields()[3]);
        record.city = fieldSetFlags()[4] ? this.city : (java.lang.String) defaultValue(fields()[4]);
        record.email = fieldSetFlags()[5] ? this.email : (java.lang.String) defaultValue(fields()[5]);
        record.type = fieldSetFlags()[6] ? this.type : (org.mddarr.rides.event.dto.AvroUserEventType) defaultValue(fields()[6]);
        return record;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<AvroUserEvent>
    WRITER$ = (org.apache.avro.io.DatumWriter<AvroUserEvent>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<AvroUserEvent>
    READER$ = (org.apache.avro.io.DatumReader<AvroUserEvent>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}
