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
public class WMLS_GetVersionResponse extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -891588836690461868L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"WMLS_GetVersionResponse\",\"namespace\":\"Energistics.Etp.v12.PrivateProtocols.WitsmlSoap\",\"fields\":[{\"name\":\"Result\",\"type\":\"string\"}],\"protocol\":\"2100\",\"messageType\":\"12\",\"senderRole\":\"store\",\"protocolRoles\":\"store,customer\",\"multipartFlag\":false,\"fullName\":\"Energistics.Etp.v12.PrivateProtocols.WitsmlSoap.WMLS_GetVersionResponse\",\"depends\":[]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<WMLS_GetVersionResponse> ENCODER =
      new BinaryMessageEncoder<WMLS_GetVersionResponse>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<WMLS_GetVersionResponse> DECODER =
      new BinaryMessageDecoder<WMLS_GetVersionResponse>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<WMLS_GetVersionResponse> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<WMLS_GetVersionResponse> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<WMLS_GetVersionResponse> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<WMLS_GetVersionResponse>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this WMLS_GetVersionResponse to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a WMLS_GetVersionResponse from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a WMLS_GetVersionResponse instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static WMLS_GetVersionResponse fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

   private java.lang.CharSequence Result;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public WMLS_GetVersionResponse() {}

  /**
   * All-args constructor.
   * @param Result The new value for Result
   */
  public WMLS_GetVersionResponse(java.lang.CharSequence Result) {
    this.Result = Result;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return Result;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: Result = (java.lang.CharSequence)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'Result' field.
   * @return The value of the 'Result' field.
   */
  public java.lang.CharSequence getResult() {
    return Result;
  }


  /**
   * Sets the value of the 'Result' field.
   * @param value the value to set.
   */
  public void setResult(java.lang.CharSequence value) {
    this.Result = value;
  }

  /**
   * Creates a new WMLS_GetVersionResponse RecordBuilder.
   * @return A new WMLS_GetVersionResponse RecordBuilder
   */
  public static Energistics.Etp.v12.PrivateProtocols.WitsmlSoap.WMLS_GetVersionResponse.Builder newBuilder() {
    return new Energistics.Etp.v12.PrivateProtocols.WitsmlSoap.WMLS_GetVersionResponse.Builder();
  }

  /**
   * Creates a new WMLS_GetVersionResponse RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new WMLS_GetVersionResponse RecordBuilder
   */
  public static Energistics.Etp.v12.PrivateProtocols.WitsmlSoap.WMLS_GetVersionResponse.Builder newBuilder(Energistics.Etp.v12.PrivateProtocols.WitsmlSoap.WMLS_GetVersionResponse.Builder other) {
    if (other == null) {
      return new Energistics.Etp.v12.PrivateProtocols.WitsmlSoap.WMLS_GetVersionResponse.Builder();
    } else {
      return new Energistics.Etp.v12.PrivateProtocols.WitsmlSoap.WMLS_GetVersionResponse.Builder(other);
    }
  }

  /**
   * Creates a new WMLS_GetVersionResponse RecordBuilder by copying an existing WMLS_GetVersionResponse instance.
   * @param other The existing instance to copy.
   * @return A new WMLS_GetVersionResponse RecordBuilder
   */
  public static Energistics.Etp.v12.PrivateProtocols.WitsmlSoap.WMLS_GetVersionResponse.Builder newBuilder(Energistics.Etp.v12.PrivateProtocols.WitsmlSoap.WMLS_GetVersionResponse other) {
    if (other == null) {
      return new Energistics.Etp.v12.PrivateProtocols.WitsmlSoap.WMLS_GetVersionResponse.Builder();
    } else {
      return new Energistics.Etp.v12.PrivateProtocols.WitsmlSoap.WMLS_GetVersionResponse.Builder(other);
    }
  }

  /**
   * RecordBuilder for WMLS_GetVersionResponse instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<WMLS_GetVersionResponse>
    implements org.apache.avro.data.RecordBuilder<WMLS_GetVersionResponse> {

    private java.lang.CharSequence Result;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(Energistics.Etp.v12.PrivateProtocols.WitsmlSoap.WMLS_GetVersionResponse.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.Result)) {
        this.Result = data().deepCopy(fields()[0].schema(), other.Result);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
    }

    /**
     * Creates a Builder by copying an existing WMLS_GetVersionResponse instance
     * @param other The existing instance to copy.
     */
    private Builder(Energistics.Etp.v12.PrivateProtocols.WitsmlSoap.WMLS_GetVersionResponse other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.Result)) {
        this.Result = data().deepCopy(fields()[0].schema(), other.Result);
        fieldSetFlags()[0] = true;
      }
    }

    /**
      * Gets the value of the 'Result' field.
      * @return The value.
      */
    public java.lang.CharSequence getResult() {
      return Result;
    }


    /**
      * Sets the value of the 'Result' field.
      * @param value The value of 'Result'.
      * @return This builder.
      */
    public Energistics.Etp.v12.PrivateProtocols.WitsmlSoap.WMLS_GetVersionResponse.Builder setResult(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.Result = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'Result' field has been set.
      * @return True if the 'Result' field has been set, false otherwise.
      */
    public boolean hasResult() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'Result' field.
      * @return This builder.
      */
    public Energistics.Etp.v12.PrivateProtocols.WitsmlSoap.WMLS_GetVersionResponse.Builder clearResult() {
      Result = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public WMLS_GetVersionResponse build() {
      try {
        WMLS_GetVersionResponse record = new WMLS_GetVersionResponse();
        record.Result = fieldSetFlags()[0] ? this.Result : (java.lang.CharSequence) defaultValue(fields()[0]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<WMLS_GetVersionResponse>
    WRITER$ = (org.apache.avro.io.DatumWriter<WMLS_GetVersionResponse>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<WMLS_GetVersionResponse>
    READER$ = (org.apache.avro.io.DatumReader<WMLS_GetVersionResponse>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    out.writeString(this.Result);

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      this.Result = in.readString(this.Result instanceof Utf8 ? (Utf8)this.Result : null);

    } else {
      for (int i = 0; i < 1; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          this.Result = in.readString(this.Result instanceof Utf8 ? (Utf8)this.Result : null);
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}









