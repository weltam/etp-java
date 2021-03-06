/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package Energistics.Etp.v12.Protocol.StoreNotification;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class SubscriptionEnded extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -5140473917991070738L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"SubscriptionEnded\",\"namespace\":\"Energistics.Etp.v12.Protocol.StoreNotification\",\"fields\":[{\"name\":\"reason\",\"type\":\"string\"},{\"name\":\"requestUuid\",\"type\":{\"type\":\"fixed\",\"name\":\"Uuid\",\"namespace\":\"Energistics.Etp.v12.Datatypes\",\"size\":16,\"fullName\":\"Energistics.Etp.v12.Datatypes.Uuid\",\"depends\":[]}}],\"protocol\":\"5\",\"messageType\":\"7\",\"senderRole\":\"store\",\"protocolRoles\":\"store,customer\",\"multipartFlag\":false,\"fullName\":\"Energistics.Etp.v12.Protocol.StoreNotification.SubscriptionEnded\",\"depends\":[\"Energistics.Etp.v12.Datatypes.Uuid\"]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<SubscriptionEnded> ENCODER =
      new BinaryMessageEncoder<SubscriptionEnded>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<SubscriptionEnded> DECODER =
      new BinaryMessageDecoder<SubscriptionEnded>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<SubscriptionEnded> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<SubscriptionEnded> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<SubscriptionEnded> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<SubscriptionEnded>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this SubscriptionEnded to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a SubscriptionEnded from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a SubscriptionEnded instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static SubscriptionEnded fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

   private java.lang.CharSequence reason;
   private Energistics.Etp.v12.Datatypes.Uuid requestUuid;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public SubscriptionEnded() {}

  /**
   * All-args constructor.
   * @param reason The new value for reason
   * @param requestUuid The new value for requestUuid
   */
  public SubscriptionEnded(java.lang.CharSequence reason, Energistics.Etp.v12.Datatypes.Uuid requestUuid) {
    this.reason = reason;
    this.requestUuid = requestUuid;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return reason;
    case 1: return requestUuid;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: reason = (java.lang.CharSequence)value$; break;
    case 1: requestUuid = (Energistics.Etp.v12.Datatypes.Uuid)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'reason' field.
   * @return The value of the 'reason' field.
   */
  public java.lang.CharSequence getReason() {
    return reason;
  }


  /**
   * Sets the value of the 'reason' field.
   * @param value the value to set.
   */
  public void setReason(java.lang.CharSequence value) {
    this.reason = value;
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
   * Creates a new SubscriptionEnded RecordBuilder.
   * @return A new SubscriptionEnded RecordBuilder
   */
  public static Energistics.Etp.v12.Protocol.StoreNotification.SubscriptionEnded.Builder newBuilder() {
    return new Energistics.Etp.v12.Protocol.StoreNotification.SubscriptionEnded.Builder();
  }

  /**
   * Creates a new SubscriptionEnded RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new SubscriptionEnded RecordBuilder
   */
  public static Energistics.Etp.v12.Protocol.StoreNotification.SubscriptionEnded.Builder newBuilder(Energistics.Etp.v12.Protocol.StoreNotification.SubscriptionEnded.Builder other) {
    if (other == null) {
      return new Energistics.Etp.v12.Protocol.StoreNotification.SubscriptionEnded.Builder();
    } else {
      return new Energistics.Etp.v12.Protocol.StoreNotification.SubscriptionEnded.Builder(other);
    }
  }

  /**
   * Creates a new SubscriptionEnded RecordBuilder by copying an existing SubscriptionEnded instance.
   * @param other The existing instance to copy.
   * @return A new SubscriptionEnded RecordBuilder
   */
  public static Energistics.Etp.v12.Protocol.StoreNotification.SubscriptionEnded.Builder newBuilder(Energistics.Etp.v12.Protocol.StoreNotification.SubscriptionEnded other) {
    if (other == null) {
      return new Energistics.Etp.v12.Protocol.StoreNotification.SubscriptionEnded.Builder();
    } else {
      return new Energistics.Etp.v12.Protocol.StoreNotification.SubscriptionEnded.Builder(other);
    }
  }

  /**
   * RecordBuilder for SubscriptionEnded instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<SubscriptionEnded>
    implements org.apache.avro.data.RecordBuilder<SubscriptionEnded> {

    private java.lang.CharSequence reason;
    private Energistics.Etp.v12.Datatypes.Uuid requestUuid;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(Energistics.Etp.v12.Protocol.StoreNotification.SubscriptionEnded.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.reason)) {
        this.reason = data().deepCopy(fields()[0].schema(), other.reason);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.requestUuid)) {
        this.requestUuid = data().deepCopy(fields()[1].schema(), other.requestUuid);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
    }

    /**
     * Creates a Builder by copying an existing SubscriptionEnded instance
     * @param other The existing instance to copy.
     */
    private Builder(Energistics.Etp.v12.Protocol.StoreNotification.SubscriptionEnded other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.reason)) {
        this.reason = data().deepCopy(fields()[0].schema(), other.reason);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.requestUuid)) {
        this.requestUuid = data().deepCopy(fields()[1].schema(), other.requestUuid);
        fieldSetFlags()[1] = true;
      }
    }

    /**
      * Gets the value of the 'reason' field.
      * @return The value.
      */
    public java.lang.CharSequence getReason() {
      return reason;
    }


    /**
      * Sets the value of the 'reason' field.
      * @param value The value of 'reason'.
      * @return This builder.
      */
    public Energistics.Etp.v12.Protocol.StoreNotification.SubscriptionEnded.Builder setReason(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.reason = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'reason' field has been set.
      * @return True if the 'reason' field has been set, false otherwise.
      */
    public boolean hasReason() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'reason' field.
      * @return This builder.
      */
    public Energistics.Etp.v12.Protocol.StoreNotification.SubscriptionEnded.Builder clearReason() {
      reason = null;
      fieldSetFlags()[0] = false;
      return this;
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
    public Energistics.Etp.v12.Protocol.StoreNotification.SubscriptionEnded.Builder setRequestUuid(Energistics.Etp.v12.Datatypes.Uuid value) {
      validate(fields()[1], value);
      this.requestUuid = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'requestUuid' field has been set.
      * @return True if the 'requestUuid' field has been set, false otherwise.
      */
    public boolean hasRequestUuid() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'requestUuid' field.
      * @return This builder.
      */
    public Energistics.Etp.v12.Protocol.StoreNotification.SubscriptionEnded.Builder clearRequestUuid() {
      requestUuid = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public SubscriptionEnded build() {
      try {
        SubscriptionEnded record = new SubscriptionEnded();
        record.reason = fieldSetFlags()[0] ? this.reason : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.requestUuid = fieldSetFlags()[1] ? this.requestUuid : (Energistics.Etp.v12.Datatypes.Uuid) defaultValue(fields()[1]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<SubscriptionEnded>
    WRITER$ = (org.apache.avro.io.DatumWriter<SubscriptionEnded>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<SubscriptionEnded>
    READER$ = (org.apache.avro.io.DatumReader<SubscriptionEnded>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    out.writeString(this.reason);

    out.writeFixed(this.requestUuid.bytes(), 0, 16);

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      this.reason = in.readString(this.reason instanceof Utf8 ? (Utf8)this.reason : null);

      if (this.requestUuid == null) {
        this.requestUuid = new Energistics.Etp.v12.Datatypes.Uuid();
      }
      in.readFixed(this.requestUuid.bytes(), 0, 16);

    } else {
      for (int i = 0; i < 2; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          this.reason = in.readString(this.reason instanceof Utf8 ? (Utf8)this.reason : null);
          break;

        case 1:
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










