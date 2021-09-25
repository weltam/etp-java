/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package Energistics.Etp.v12.Protocol.Core;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class Pong extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 1660501806067825181L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Pong\",\"namespace\":\"Energistics.Etp.v12.Protocol.Core\",\"fields\":[{\"name\":\"currentDateTime\",\"type\":\"long\"}],\"protocol\":\"0\",\"messageType\":\"9\",\"senderRole\":\"client,server\",\"protocolRoles\":\"client, server\",\"multipartFlag\":false,\"fullName\":\"Energistics.Etp.v12.Protocol.Core.Pong\",\"depends\":[]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<Pong> ENCODER =
      new BinaryMessageEncoder<Pong>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<Pong> DECODER =
      new BinaryMessageDecoder<Pong>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<Pong> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<Pong> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<Pong> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<Pong>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this Pong to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a Pong from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a Pong instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static Pong fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

   private long currentDateTime;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public Pong() {}

  /**
   * All-args constructor.
   * @param currentDateTime The new value for currentDateTime
   */
  public Pong(java.lang.Long currentDateTime) {
    this.currentDateTime = currentDateTime;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return currentDateTime;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: currentDateTime = (java.lang.Long)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'currentDateTime' field.
   * @return The value of the 'currentDateTime' field.
   */
  public long getCurrentDateTime() {
    return currentDateTime;
  }


  /**
   * Sets the value of the 'currentDateTime' field.
   * @param value the value to set.
   */
  public void setCurrentDateTime(long value) {
    this.currentDateTime = value;
  }

  /**
   * Creates a new Pong RecordBuilder.
   * @return A new Pong RecordBuilder
   */
  public static Energistics.Etp.v12.Protocol.Core.Pong.Builder newBuilder() {
    return new Energistics.Etp.v12.Protocol.Core.Pong.Builder();
  }

  /**
   * Creates a new Pong RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new Pong RecordBuilder
   */
  public static Energistics.Etp.v12.Protocol.Core.Pong.Builder newBuilder(Energistics.Etp.v12.Protocol.Core.Pong.Builder other) {
    if (other == null) {
      return new Energistics.Etp.v12.Protocol.Core.Pong.Builder();
    } else {
      return new Energistics.Etp.v12.Protocol.Core.Pong.Builder(other);
    }
  }

  /**
   * Creates a new Pong RecordBuilder by copying an existing Pong instance.
   * @param other The existing instance to copy.
   * @return A new Pong RecordBuilder
   */
  public static Energistics.Etp.v12.Protocol.Core.Pong.Builder newBuilder(Energistics.Etp.v12.Protocol.Core.Pong other) {
    if (other == null) {
      return new Energistics.Etp.v12.Protocol.Core.Pong.Builder();
    } else {
      return new Energistics.Etp.v12.Protocol.Core.Pong.Builder(other);
    }
  }

  /**
   * RecordBuilder for Pong instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Pong>
    implements org.apache.avro.data.RecordBuilder<Pong> {

    private long currentDateTime;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(Energistics.Etp.v12.Protocol.Core.Pong.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.currentDateTime)) {
        this.currentDateTime = data().deepCopy(fields()[0].schema(), other.currentDateTime);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
    }

    /**
     * Creates a Builder by copying an existing Pong instance
     * @param other The existing instance to copy.
     */
    private Builder(Energistics.Etp.v12.Protocol.Core.Pong other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.currentDateTime)) {
        this.currentDateTime = data().deepCopy(fields()[0].schema(), other.currentDateTime);
        fieldSetFlags()[0] = true;
      }
    }

    /**
      * Gets the value of the 'currentDateTime' field.
      * @return The value.
      */
    public long getCurrentDateTime() {
      return currentDateTime;
    }


    /**
      * Sets the value of the 'currentDateTime' field.
      * @param value The value of 'currentDateTime'.
      * @return This builder.
      */
    public Energistics.Etp.v12.Protocol.Core.Pong.Builder setCurrentDateTime(long value) {
      validate(fields()[0], value);
      this.currentDateTime = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'currentDateTime' field has been set.
      * @return True if the 'currentDateTime' field has been set, false otherwise.
      */
    public boolean hasCurrentDateTime() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'currentDateTime' field.
      * @return This builder.
      */
    public Energistics.Etp.v12.Protocol.Core.Pong.Builder clearCurrentDateTime() {
      fieldSetFlags()[0] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public Pong build() {
      try {
        Pong record = new Pong();
        record.currentDateTime = fieldSetFlags()[0] ? this.currentDateTime : (java.lang.Long) defaultValue(fields()[0]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<Pong>
    WRITER$ = (org.apache.avro.io.DatumWriter<Pong>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<Pong>
    READER$ = (org.apache.avro.io.DatumReader<Pong>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    out.writeLong(this.currentDateTime);

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      this.currentDateTime = in.readLong();

    } else {
      for (int i = 0; i < 1; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          this.currentDateTime = in.readLong();
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}









