/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package Energistics.Etp.v12.Protocol.GrowingObjectNotification;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class UnsubscribePartNotification extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -677781249221690001L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"UnsubscribePartNotification\",\"namespace\":\"Energistics.Etp.v12.Protocol.GrowingObjectNotification\",\"fields\":[{\"name\":\"requestUuid\",\"type\":{\"type\":\"fixed\",\"name\":\"Uuid\",\"namespace\":\"Energistics.Etp.v12.Datatypes\",\"size\":16,\"fullName\":\"Energistics.Etp.v12.Datatypes.Uuid\",\"depends\":[]}}],\"protocol\":\"7\",\"messageType\":\"4\",\"senderRole\":\"customer\",\"protocolRoles\":\"store,customer\",\"multipartFlag\":false,\"fullName\":\"Energistics.Etp.v12.Protocol.GrowingObjectNotification.UnsubscribePartNotification\",\"depends\":[\"Energistics.Etp.v12.Datatypes.Uuid\"]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<UnsubscribePartNotification> ENCODER =
      new BinaryMessageEncoder<UnsubscribePartNotification>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<UnsubscribePartNotification> DECODER =
      new BinaryMessageDecoder<UnsubscribePartNotification>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<UnsubscribePartNotification> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<UnsubscribePartNotification> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<UnsubscribePartNotification> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<UnsubscribePartNotification>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this UnsubscribePartNotification to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a UnsubscribePartNotification from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a UnsubscribePartNotification instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static UnsubscribePartNotification fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

   private Energistics.Etp.v12.Datatypes.Uuid requestUuid;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public UnsubscribePartNotification() {}

  /**
   * All-args constructor.
   * @param requestUuid The new value for requestUuid
   */
  public UnsubscribePartNotification(Energistics.Etp.v12.Datatypes.Uuid requestUuid) {
    this.requestUuid = requestUuid;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return requestUuid;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: requestUuid = (Energistics.Etp.v12.Datatypes.Uuid)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'requestUuid' field.
   * @return The value of the 'requestUuid' field.
   */
  public Energistics.Etp.v12.Datatypes.Uuid getRequestUuid() {
    return requestUuid;
  }


  /**
   * Sets the value of the 'requestUuid' field.
   * @param value the value to set.
   */
  public void setRequestUuid(Energistics.Etp.v12.Datatypes.Uuid value) {
    this.requestUuid = value;
  }

  /**
   * Creates a new UnsubscribePartNotification RecordBuilder.
   * @return A new UnsubscribePartNotification RecordBuilder
   */
  public static Energistics.Etp.v12.Protocol.GrowingObjectNotification.UnsubscribePartNotification.Builder newBuilder() {
    return new Energistics.Etp.v12.Protocol.GrowingObjectNotification.UnsubscribePartNotification.Builder();
  }

  /**
   * Creates a new UnsubscribePartNotification RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new UnsubscribePartNotification RecordBuilder
   */
  public static Energistics.Etp.v12.Protocol.GrowingObjectNotification.UnsubscribePartNotification.Builder newBuilder(Energistics.Etp.v12.Protocol.GrowingObjectNotification.UnsubscribePartNotification.Builder other) {
    if (other == null) {
      return new Energistics.Etp.v12.Protocol.GrowingObjectNotification.UnsubscribePartNotification.Builder();
    } else {
      return new Energistics.Etp.v12.Protocol.GrowingObjectNotification.UnsubscribePartNotification.Builder(other);
    }
  }

  /**
   * Creates a new UnsubscribePartNotification RecordBuilder by copying an existing UnsubscribePartNotification instance.
   * @param other The existing instance to copy.
   * @return A new UnsubscribePartNotification RecordBuilder
   */
  public static Energistics.Etp.v12.Protocol.GrowingObjectNotification.UnsubscribePartNotification.Builder newBuilder(Energistics.Etp.v12.Protocol.GrowingObjectNotification.UnsubscribePartNotification other) {
    if (other == null) {
      return new Energistics.Etp.v12.Protocol.GrowingObjectNotification.UnsubscribePartNotification.Builder();
    } else {
      return new Energistics.Etp.v12.Protocol.GrowingObjectNotification.UnsubscribePartNotification.Builder(other);
    }
  }

  /**
   * RecordBuilder for UnsubscribePartNotification instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<UnsubscribePartNotification>
    implements org.apache.avro.data.RecordBuilder<UnsubscribePartNotification> {

    private Energistics.Etp.v12.Datatypes.Uuid requestUuid;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(Energistics.Etp.v12.Protocol.GrowingObjectNotification.UnsubscribePartNotification.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.requestUuid)) {
        this.requestUuid = data().deepCopy(fields()[0].schema(), other.requestUuid);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
    }

    /**
     * Creates a Builder by copying an existing UnsubscribePartNotification instance
     * @param other The existing instance to copy.
     */
    private Builder(Energistics.Etp.v12.Protocol.GrowingObjectNotification.UnsubscribePartNotification other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.requestUuid)) {
        this.requestUuid = data().deepCopy(fields()[0].schema(), other.requestUuid);
        fieldSetFlags()[0] = true;
      }
    }

    /**
      * Gets the value of the 'requestUuid' field.
      * @return The value.
      */
    public Energistics.Etp.v12.Datatypes.Uuid getRequestUuid() {
      return requestUuid;
    }


    /**
      * Sets the value of the 'requestUuid' field.
      * @param value The value of 'requestUuid'.
      * @return This builder.
      */
    public Energistics.Etp.v12.Protocol.GrowingObjectNotification.UnsubscribePartNotification.Builder setRequestUuid(Energistics.Etp.v12.Datatypes.Uuid value) {
      validate(fields()[0], value);
      this.requestUuid = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'requestUuid' field has been set.
      * @return True if the 'requestUuid' field has been set, false otherwise.
      */
    public boolean hasRequestUuid() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'requestUuid' field.
      * @return This builder.
      */
    public Energistics.Etp.v12.Protocol.GrowingObjectNotification.UnsubscribePartNotification.Builder clearRequestUuid() {
      requestUuid = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public UnsubscribePartNotification build() {
      try {
        UnsubscribePartNotification record = new UnsubscribePartNotification();
        record.requestUuid = fieldSetFlags()[0] ? this.requestUuid : (Energistics.Etp.v12.Datatypes.Uuid) defaultValue(fields()[0]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<UnsubscribePartNotification>
    WRITER$ = (org.apache.avro.io.DatumWriter<UnsubscribePartNotification>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<UnsubscribePartNotification>
    READER$ = (org.apache.avro.io.DatumReader<UnsubscribePartNotification>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    out.writeFixed(this.requestUuid.bytes(), 0, 16);

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      if (this.requestUuid == null) {
        this.requestUuid = new Energistics.Etp.v12.Datatypes.Uuid();
      }
      in.readFixed(this.requestUuid.bytes(), 0, 16);

    } else {
      for (int i = 0; i < 1; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          if (this.requestUuid == null) {
            this.requestUuid = new Energistics.Etp.v12.Datatypes.Uuid();
          }
          in.readFixed(this.requestUuid.bytes(), 0, 16);
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}










