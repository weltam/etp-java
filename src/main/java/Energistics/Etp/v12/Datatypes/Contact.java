/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package Energistics.Etp.v12.Datatypes;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class Contact extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -7029168386345327335L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Contact\",\"namespace\":\"Energistics.Etp.v12.Datatypes\",\"fields\":[{\"name\":\"organizationName\",\"type\":\"string\",\"default\":\"\"},{\"name\":\"contactName\",\"type\":\"string\",\"default\":\"\"},{\"name\":\"contactPhone\",\"type\":\"string\",\"default\":\"\"},{\"name\":\"contactEmail\",\"type\":\"string\",\"default\":\"\"}],\"fullName\":\"Energistics.Etp.v12.Datatypes.Contact\",\"depends\":[]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<Contact> ENCODER =
      new BinaryMessageEncoder<Contact>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<Contact> DECODER =
      new BinaryMessageDecoder<Contact>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<Contact> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<Contact> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<Contact> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<Contact>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this Contact to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a Contact from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a Contact instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static Contact fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

   private java.lang.CharSequence organizationName;
   private java.lang.CharSequence contactName;
   private java.lang.CharSequence contactPhone;
   private java.lang.CharSequence contactEmail;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public Contact() {}

  /**
   * All-args constructor.
   * @param organizationName The new value for organizationName
   * @param contactName The new value for contactName
   * @param contactPhone The new value for contactPhone
   * @param contactEmail The new value for contactEmail
   */
  public Contact(java.lang.CharSequence organizationName, java.lang.CharSequence contactName, java.lang.CharSequence contactPhone, java.lang.CharSequence contactEmail) {
    this.organizationName = organizationName;
    this.contactName = contactName;
    this.contactPhone = contactPhone;
    this.contactEmail = contactEmail;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return organizationName;
    case 1: return contactName;
    case 2: return contactPhone;
    case 3: return contactEmail;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: organizationName = (java.lang.CharSequence)value$; break;
    case 1: contactName = (java.lang.CharSequence)value$; break;
    case 2: contactPhone = (java.lang.CharSequence)value$; break;
    case 3: contactEmail = (java.lang.CharSequence)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'organizationName' field.
   * @return The value of the 'organizationName' field.
   */
  public java.lang.CharSequence getOrganizationName() {
    return organizationName;
  }


  /**
   * Sets the value of the 'organizationName' field.
   * @param value the value to set.
   */
  public void setOrganizationName(java.lang.CharSequence value) {
    this.organizationName = value;
  }

  /**
   * Gets the value of the 'contactName' field.
   * @return The value of the 'contactName' field.
   */
  public java.lang.CharSequence getContactName() {
    return contactName;
  }


  /**
   * Sets the value of the 'contactName' field.
   * @param value the value to set.
   */
  public void setContactName(java.lang.CharSequence value) {
    this.contactName = value;
  }

  /**
   * Gets the value of the 'contactPhone' field.
   * @return The value of the 'contactPhone' field.
   */
  public java.lang.CharSequence getContactPhone() {
    return contactPhone;
  }


  /**
   * Sets the value of the 'contactPhone' field.
   * @param value the value to set.
   */
  public void setContactPhone(java.lang.CharSequence value) {
    this.contactPhone = value;
  }

  /**
   * Gets the value of the 'contactEmail' field.
   * @return The value of the 'contactEmail' field.
   */
  public java.lang.CharSequence getContactEmail() {
    return contactEmail;
  }


  /**
   * Sets the value of the 'contactEmail' field.
   * @param value the value to set.
   */
  public void setContactEmail(java.lang.CharSequence value) {
    this.contactEmail = value;
  }

  /**
   * Creates a new Contact RecordBuilder.
   * @return A new Contact RecordBuilder
   */
  public static Energistics.Etp.v12.Datatypes.Contact.Builder newBuilder() {
    return new Energistics.Etp.v12.Datatypes.Contact.Builder();
  }

  /**
   * Creates a new Contact RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new Contact RecordBuilder
   */
  public static Energistics.Etp.v12.Datatypes.Contact.Builder newBuilder(Energistics.Etp.v12.Datatypes.Contact.Builder other) {
    if (other == null) {
      return new Energistics.Etp.v12.Datatypes.Contact.Builder();
    } else {
      return new Energistics.Etp.v12.Datatypes.Contact.Builder(other);
    }
  }

  /**
   * Creates a new Contact RecordBuilder by copying an existing Contact instance.
   * @param other The existing instance to copy.
   * @return A new Contact RecordBuilder
   */
  public static Energistics.Etp.v12.Datatypes.Contact.Builder newBuilder(Energistics.Etp.v12.Datatypes.Contact other) {
    if (other == null) {
      return new Energistics.Etp.v12.Datatypes.Contact.Builder();
    } else {
      return new Energistics.Etp.v12.Datatypes.Contact.Builder(other);
    }
  }

  /**
   * RecordBuilder for Contact instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Contact>
    implements org.apache.avro.data.RecordBuilder<Contact> {

    private java.lang.CharSequence organizationName;
    private java.lang.CharSequence contactName;
    private java.lang.CharSequence contactPhone;
    private java.lang.CharSequence contactEmail;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(Energistics.Etp.v12.Datatypes.Contact.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.organizationName)) {
        this.organizationName = data().deepCopy(fields()[0].schema(), other.organizationName);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.contactName)) {
        this.contactName = data().deepCopy(fields()[1].schema(), other.contactName);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.contactPhone)) {
        this.contactPhone = data().deepCopy(fields()[2].schema(), other.contactPhone);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
      if (isValidValue(fields()[3], other.contactEmail)) {
        this.contactEmail = data().deepCopy(fields()[3].schema(), other.contactEmail);
        fieldSetFlags()[3] = other.fieldSetFlags()[3];
      }
    }

    /**
     * Creates a Builder by copying an existing Contact instance
     * @param other The existing instance to copy.
     */
    private Builder(Energistics.Etp.v12.Datatypes.Contact other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.organizationName)) {
        this.organizationName = data().deepCopy(fields()[0].schema(), other.organizationName);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.contactName)) {
        this.contactName = data().deepCopy(fields()[1].schema(), other.contactName);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.contactPhone)) {
        this.contactPhone = data().deepCopy(fields()[2].schema(), other.contactPhone);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.contactEmail)) {
        this.contactEmail = data().deepCopy(fields()[3].schema(), other.contactEmail);
        fieldSetFlags()[3] = true;
      }
    }

    /**
      * Gets the value of the 'organizationName' field.
      * @return The value.
      */
    public java.lang.CharSequence getOrganizationName() {
      return organizationName;
    }


    /**
      * Sets the value of the 'organizationName' field.
      * @param value The value of 'organizationName'.
      * @return This builder.
      */
    public Energistics.Etp.v12.Datatypes.Contact.Builder setOrganizationName(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.organizationName = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'organizationName' field has been set.
      * @return True if the 'organizationName' field has been set, false otherwise.
      */
    public boolean hasOrganizationName() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'organizationName' field.
      * @return This builder.
      */
    public Energistics.Etp.v12.Datatypes.Contact.Builder clearOrganizationName() {
      organizationName = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'contactName' field.
      * @return The value.
      */
    public java.lang.CharSequence getContactName() {
      return contactName;
    }


    /**
      * Sets the value of the 'contactName' field.
      * @param value The value of 'contactName'.
      * @return This builder.
      */
    public Energistics.Etp.v12.Datatypes.Contact.Builder setContactName(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.contactName = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'contactName' field has been set.
      * @return True if the 'contactName' field has been set, false otherwise.
      */
    public boolean hasContactName() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'contactName' field.
      * @return This builder.
      */
    public Energistics.Etp.v12.Datatypes.Contact.Builder clearContactName() {
      contactName = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'contactPhone' field.
      * @return The value.
      */
    public java.lang.CharSequence getContactPhone() {
      return contactPhone;
    }


    /**
      * Sets the value of the 'contactPhone' field.
      * @param value The value of 'contactPhone'.
      * @return This builder.
      */
    public Energistics.Etp.v12.Datatypes.Contact.Builder setContactPhone(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.contactPhone = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'contactPhone' field has been set.
      * @return True if the 'contactPhone' field has been set, false otherwise.
      */
    public boolean hasContactPhone() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'contactPhone' field.
      * @return This builder.
      */
    public Energistics.Etp.v12.Datatypes.Contact.Builder clearContactPhone() {
      contactPhone = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'contactEmail' field.
      * @return The value.
      */
    public java.lang.CharSequence getContactEmail() {
      return contactEmail;
    }


    /**
      * Sets the value of the 'contactEmail' field.
      * @param value The value of 'contactEmail'.
      * @return This builder.
      */
    public Energistics.Etp.v12.Datatypes.Contact.Builder setContactEmail(java.lang.CharSequence value) {
      validate(fields()[3], value);
      this.contactEmail = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'contactEmail' field has been set.
      * @return True if the 'contactEmail' field has been set, false otherwise.
      */
    public boolean hasContactEmail() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'contactEmail' field.
      * @return This builder.
      */
    public Energistics.Etp.v12.Datatypes.Contact.Builder clearContactEmail() {
      contactEmail = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public Contact build() {
      try {
        Contact record = new Contact();
        record.organizationName = fieldSetFlags()[0] ? this.organizationName : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.contactName = fieldSetFlags()[1] ? this.contactName : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.contactPhone = fieldSetFlags()[2] ? this.contactPhone : (java.lang.CharSequence) defaultValue(fields()[2]);
        record.contactEmail = fieldSetFlags()[3] ? this.contactEmail : (java.lang.CharSequence) defaultValue(fields()[3]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<Contact>
    WRITER$ = (org.apache.avro.io.DatumWriter<Contact>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<Contact>
    READER$ = (org.apache.avro.io.DatumReader<Contact>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    out.writeString(this.organizationName);

    out.writeString(this.contactName);

    out.writeString(this.contactPhone);

    out.writeString(this.contactEmail);

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      this.organizationName = in.readString(this.organizationName instanceof Utf8 ? (Utf8)this.organizationName : null);

      this.contactName = in.readString(this.contactName instanceof Utf8 ? (Utf8)this.contactName : null);

      this.contactPhone = in.readString(this.contactPhone instanceof Utf8 ? (Utf8)this.contactPhone : null);

      this.contactEmail = in.readString(this.contactEmail instanceof Utf8 ? (Utf8)this.contactEmail : null);

    } else {
      for (int i = 0; i < 4; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          this.organizationName = in.readString(this.organizationName instanceof Utf8 ? (Utf8)this.organizationName : null);
          break;

        case 1:
          this.contactName = in.readString(this.contactName instanceof Utf8 ? (Utf8)this.contactName : null);
          break;

        case 2:
          this.contactPhone = in.readString(this.contactPhone instanceof Utf8 ? (Utf8)this.contactPhone : null);
          break;

        case 3:
          this.contactEmail = in.readString(this.contactEmail instanceof Utf8 ? (Utf8)this.contactEmail : null);
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}









