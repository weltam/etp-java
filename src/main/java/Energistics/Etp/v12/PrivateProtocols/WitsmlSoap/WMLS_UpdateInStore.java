/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package Energistics.Etp.v12.PrivateProtocols.WitsmlSoap;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class WMLS_UpdateInStore extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 3621155110349519715L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"WMLS_UpdateInStore\",\"namespace\":\"Energistics.Etp.v12.PrivateProtocols.WitsmlSoap\",\"fields\":[{\"name\":\"WMLtypeIn\",\"type\":\"string\"},{\"name\":\"XMLin\",\"type\":\"string\"},{\"name\":\"OptionsIn\",\"type\":\"string\"},{\"name\":\"CapabilitiesIn\",\"type\":\"string\"}],\"protocol\":\"2100\",\"messageType\":\"13\",\"senderRole\":\"customer\",\"protocolRoles\":\"store,customer\",\"multipartFlag\":false,\"fullName\":\"Energistics.Etp.v12.PrivateProtocols.WitsmlSoap.WMLS_UpdateInStore\",\"depends\":[]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<WMLS_UpdateInStore> ENCODER =
      new BinaryMessageEncoder<WMLS_UpdateInStore>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<WMLS_UpdateInStore> DECODER =
      new BinaryMessageDecoder<WMLS_UpdateInStore>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<WMLS_UpdateInStore> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<WMLS_UpdateInStore> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<WMLS_UpdateInStore> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<WMLS_UpdateInStore>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this WMLS_UpdateInStore to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a WMLS_UpdateInStore from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a WMLS_UpdateInStore instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static WMLS_UpdateInStore fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

   private java.lang.CharSequence WMLtypeIn;
   private java.lang.CharSequence XMLin;
   private java.lang.CharSequence OptionsIn;
   private java.lang.CharSequence CapabilitiesIn;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public WMLS_UpdateInStore() {}

  /**
   * All-args constructor.
   * @param WMLtypeIn The new value for WMLtypeIn
   * @param XMLin The new value for XMLin
   * @param OptionsIn The new value for OptionsIn
   * @param CapabilitiesIn The new value for CapabilitiesIn
   */
  public WMLS_UpdateInStore(java.lang.CharSequence WMLtypeIn, java.lang.CharSequence XMLin, java.lang.CharSequence OptionsIn, java.lang.CharSequence CapabilitiesIn) {
    this.WMLtypeIn = WMLtypeIn;
    this.XMLin = XMLin;
    this.OptionsIn = OptionsIn;
    this.CapabilitiesIn = CapabilitiesIn;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return WMLtypeIn;
    case 1: return XMLin;
    case 2: return OptionsIn;
    case 3: return CapabilitiesIn;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: WMLtypeIn = (java.lang.CharSequence)value$; break;
    case 1: XMLin = (java.lang.CharSequence)value$; break;
    case 2: OptionsIn = (java.lang.CharSequence)value$; break;
    case 3: CapabilitiesIn = (java.lang.CharSequence)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'WMLtypeIn' field.
   * @return The value of the 'WMLtypeIn' field.
   */
  public java.lang.CharSequence getWMLtypeIn() {
    return WMLtypeIn;
  }


  /**
   * Sets the value of the 'WMLtypeIn' field.
   * @param value the value to set.
   */
  public void setWMLtypeIn(java.lang.CharSequence value) {
    this.WMLtypeIn = value;
  }

  /**
   * Gets the value of the 'XMLin' field.
   * @return The value of the 'XMLin' field.
   */
  public java.lang.CharSequence getXMLin() {
    return XMLin;
  }


  /**
   * Sets the value of the 'XMLin' field.
   * @param value the value to set.
   */
  public void setXMLin(java.lang.CharSequence value) {
    this.XMLin = value;
  }

  /**
   * Gets the value of the 'OptionsIn' field.
   * @return The value of the 'OptionsIn' field.
   */
  public java.lang.CharSequence getOptionsIn() {
    return OptionsIn;
  }


  /**
   * Sets the value of the 'OptionsIn' field.
   * @param value the value to set.
   */
  public void setOptionsIn(java.lang.CharSequence value) {
    this.OptionsIn = value;
  }

  /**
   * Gets the value of the 'CapabilitiesIn' field.
   * @return The value of the 'CapabilitiesIn' field.
   */
  public java.lang.CharSequence getCapabilitiesIn() {
    return CapabilitiesIn;
  }


  /**
   * Sets the value of the 'CapabilitiesIn' field.
   * @param value the value to set.
   */
  public void setCapabilitiesIn(java.lang.CharSequence value) {
    this.CapabilitiesIn = value;
  }

  /**
   * Creates a new WMLS_UpdateInStore RecordBuilder.
   * @return A new WMLS_UpdateInStore RecordBuilder
   */
  public static Energistics.Etp.v12.PrivateProtocols.WitsmlSoap.WMLS_UpdateInStore.Builder newBuilder() {
    return new Energistics.Etp.v12.PrivateProtocols.WitsmlSoap.WMLS_UpdateInStore.Builder();
  }

  /**
   * Creates a new WMLS_UpdateInStore RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new WMLS_UpdateInStore RecordBuilder
   */
  public static Energistics.Etp.v12.PrivateProtocols.WitsmlSoap.WMLS_UpdateInStore.Builder newBuilder(Energistics.Etp.v12.PrivateProtocols.WitsmlSoap.WMLS_UpdateInStore.Builder other) {
    if (other == null) {
      return new Energistics.Etp.v12.PrivateProtocols.WitsmlSoap.WMLS_UpdateInStore.Builder();
    } else {
      return new Energistics.Etp.v12.PrivateProtocols.WitsmlSoap.WMLS_UpdateInStore.Builder(other);
    }
  }

  /**
   * Creates a new WMLS_UpdateInStore RecordBuilder by copying an existing WMLS_UpdateInStore instance.
   * @param other The existing instance to copy.
   * @return A new WMLS_UpdateInStore RecordBuilder
   */
  public static Energistics.Etp.v12.PrivateProtocols.WitsmlSoap.WMLS_UpdateInStore.Builder newBuilder(Energistics.Etp.v12.PrivateProtocols.WitsmlSoap.WMLS_UpdateInStore other) {
    if (other == null) {
      return new Energistics.Etp.v12.PrivateProtocols.WitsmlSoap.WMLS_UpdateInStore.Builder();
    } else {
      return new Energistics.Etp.v12.PrivateProtocols.WitsmlSoap.WMLS_UpdateInStore.Builder(other);
    }
  }

  /**
   * RecordBuilder for WMLS_UpdateInStore instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<WMLS_UpdateInStore>
    implements org.apache.avro.data.RecordBuilder<WMLS_UpdateInStore> {

    private java.lang.CharSequence WMLtypeIn;
    private java.lang.CharSequence XMLin;
    private java.lang.CharSequence OptionsIn;
    private java.lang.CharSequence CapabilitiesIn;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(Energistics.Etp.v12.PrivateProtocols.WitsmlSoap.WMLS_UpdateInStore.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.WMLtypeIn)) {
        this.WMLtypeIn = data().deepCopy(fields()[0].schema(), other.WMLtypeIn);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.XMLin)) {
        this.XMLin = data().deepCopy(fields()[1].schema(), other.XMLin);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.OptionsIn)) {
        this.OptionsIn = data().deepCopy(fields()[2].schema(), other.OptionsIn);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
      if (isValidValue(fields()[3], other.CapabilitiesIn)) {
        this.CapabilitiesIn = data().deepCopy(fields()[3].schema(), other.CapabilitiesIn);
        fieldSetFlags()[3] = other.fieldSetFlags()[3];
      }
    }

    /**
     * Creates a Builder by copying an existing WMLS_UpdateInStore instance
     * @param other The existing instance to copy.
     */
    private Builder(Energistics.Etp.v12.PrivateProtocols.WitsmlSoap.WMLS_UpdateInStore other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.WMLtypeIn)) {
        this.WMLtypeIn = data().deepCopy(fields()[0].schema(), other.WMLtypeIn);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.XMLin)) {
        this.XMLin = data().deepCopy(fields()[1].schema(), other.XMLin);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.OptionsIn)) {
        this.OptionsIn = data().deepCopy(fields()[2].schema(), other.OptionsIn);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.CapabilitiesIn)) {
        this.CapabilitiesIn = data().deepCopy(fields()[3].schema(), other.CapabilitiesIn);
        fieldSetFlags()[3] = true;
      }
    }

    /**
      * Gets the value of the 'WMLtypeIn' field.
      * @return The value.
      */
    public java.lang.CharSequence getWMLtypeIn() {
      return WMLtypeIn;
    }


    /**
      * Sets the value of the 'WMLtypeIn' field.
      * @param value The value of 'WMLtypeIn'.
      * @return This builder.
      */
    public Energistics.Etp.v12.PrivateProtocols.WitsmlSoap.WMLS_UpdateInStore.Builder setWMLtypeIn(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.WMLtypeIn = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'WMLtypeIn' field has been set.
      * @return True if the 'WMLtypeIn' field has been set, false otherwise.
      */
    public boolean hasWMLtypeIn() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'WMLtypeIn' field.
      * @return This builder.
      */
    public Energistics.Etp.v12.PrivateProtocols.WitsmlSoap.WMLS_UpdateInStore.Builder clearWMLtypeIn() {
      WMLtypeIn = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'XMLin' field.
      * @return The value.
      */
    public java.lang.CharSequence getXMLin() {
      return XMLin;
    }


    /**
      * Sets the value of the 'XMLin' field.
      * @param value The value of 'XMLin'.
      * @return This builder.
      */
    public Energistics.Etp.v12.PrivateProtocols.WitsmlSoap.WMLS_UpdateInStore.Builder setXMLin(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.XMLin = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'XMLin' field has been set.
      * @return True if the 'XMLin' field has been set, false otherwise.
      */
    public boolean hasXMLin() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'XMLin' field.
      * @return This builder.
      */
    public Energistics.Etp.v12.PrivateProtocols.WitsmlSoap.WMLS_UpdateInStore.Builder clearXMLin() {
      XMLin = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'OptionsIn' field.
      * @return The value.
      */
    public java.lang.CharSequence getOptionsIn() {
      return OptionsIn;
    }


    /**
      * Sets the value of the 'OptionsIn' field.
      * @param value The value of 'OptionsIn'.
      * @return This builder.
      */
    public Energistics.Etp.v12.PrivateProtocols.WitsmlSoap.WMLS_UpdateInStore.Builder setOptionsIn(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.OptionsIn = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'OptionsIn' field has been set.
      * @return True if the 'OptionsIn' field has been set, false otherwise.
      */
    public boolean hasOptionsIn() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'OptionsIn' field.
      * @return This builder.
      */
    public Energistics.Etp.v12.PrivateProtocols.WitsmlSoap.WMLS_UpdateInStore.Builder clearOptionsIn() {
      OptionsIn = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'CapabilitiesIn' field.
      * @return The value.
      */
    public java.lang.CharSequence getCapabilitiesIn() {
      return CapabilitiesIn;
    }


    /**
      * Sets the value of the 'CapabilitiesIn' field.
      * @param value The value of 'CapabilitiesIn'.
      * @return This builder.
      */
    public Energistics.Etp.v12.PrivateProtocols.WitsmlSoap.WMLS_UpdateInStore.Builder setCapabilitiesIn(java.lang.CharSequence value) {
      validate(fields()[3], value);
      this.CapabilitiesIn = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'CapabilitiesIn' field has been set.
      * @return True if the 'CapabilitiesIn' field has been set, false otherwise.
      */
    public boolean hasCapabilitiesIn() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'CapabilitiesIn' field.
      * @return This builder.
      */
    public Energistics.Etp.v12.PrivateProtocols.WitsmlSoap.WMLS_UpdateInStore.Builder clearCapabilitiesIn() {
      CapabilitiesIn = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public WMLS_UpdateInStore build() {
      try {
        WMLS_UpdateInStore record = new WMLS_UpdateInStore();
        record.WMLtypeIn = fieldSetFlags()[0] ? this.WMLtypeIn : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.XMLin = fieldSetFlags()[1] ? this.XMLin : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.OptionsIn = fieldSetFlags()[2] ? this.OptionsIn : (java.lang.CharSequence) defaultValue(fields()[2]);
        record.CapabilitiesIn = fieldSetFlags()[3] ? this.CapabilitiesIn : (java.lang.CharSequence) defaultValue(fields()[3]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<WMLS_UpdateInStore>
    WRITER$ = (org.apache.avro.io.DatumWriter<WMLS_UpdateInStore>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<WMLS_UpdateInStore>
    READER$ = (org.apache.avro.io.DatumReader<WMLS_UpdateInStore>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    out.writeString(this.WMLtypeIn);

    out.writeString(this.XMLin);

    out.writeString(this.OptionsIn);

    out.writeString(this.CapabilitiesIn);

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      this.WMLtypeIn = in.readString(this.WMLtypeIn instanceof Utf8 ? (Utf8)this.WMLtypeIn : null);

      this.XMLin = in.readString(this.XMLin instanceof Utf8 ? (Utf8)this.XMLin : null);

      this.OptionsIn = in.readString(this.OptionsIn instanceof Utf8 ? (Utf8)this.OptionsIn : null);

      this.CapabilitiesIn = in.readString(this.CapabilitiesIn instanceof Utf8 ? (Utf8)this.CapabilitiesIn : null);

    } else {
      for (int i = 0; i < 4; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          this.WMLtypeIn = in.readString(this.WMLtypeIn instanceof Utf8 ? (Utf8)this.WMLtypeIn : null);
          break;

        case 1:
          this.XMLin = in.readString(this.XMLin instanceof Utf8 ? (Utf8)this.XMLin : null);
          break;

        case 2:
          this.OptionsIn = in.readString(this.OptionsIn instanceof Utf8 ? (Utf8)this.OptionsIn : null);
          break;

        case 3:
          this.CapabilitiesIn = in.readString(this.CapabilitiesIn instanceof Utf8 ? (Utf8)this.CapabilitiesIn : null);
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}










