/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package Energistics.Etp.v12.Protocol.ChannelDataLoad;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class ReplaceRangeResponse extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -5626224046842066659L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"ReplaceRangeResponse\",\"namespace\":\"Energistics.Etp.v12.Protocol.ChannelDataLoad\",\"fields\":[{\"name\":\"channelChangeTime\",\"type\":\"long\"}],\"protocol\":\"22\",\"messageType\":\"8\",\"senderRole\":\"store\",\"protocolRoles\":\"store,customer\",\"multipartFlag\":false,\"fullName\":\"Energistics.Etp.v12.Protocol.ChannelDataLoad.ReplaceRangeResponse\",\"depends\":[]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<ReplaceRangeResponse> ENCODER =
      new BinaryMessageEncoder<ReplaceRangeResponse>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<ReplaceRangeResponse> DECODER =
      new BinaryMessageDecoder<ReplaceRangeResponse>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<ReplaceRangeResponse> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<ReplaceRangeResponse> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<ReplaceRangeResponse> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<ReplaceRangeResponse>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this ReplaceRangeResponse to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a ReplaceRangeResponse from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a ReplaceRangeResponse instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static ReplaceRangeResponse fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

   private long channelChangeTime;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public ReplaceRangeResponse() {}

  /**
   * All-args constructor.
   * @param channelChangeTime The new value for channelChangeTime
   */
  public ReplaceRangeResponse(java.lang.Long channelChangeTime) {
    this.channelChangeTime = channelChangeTime;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return channelChangeTime;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: channelChangeTime = (java.lang.Long)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'channelChangeTime' field.
   * @return The value of the 'channelChangeTime' field.
   */
  public long getChannelChangeTime() {
    return channelChangeTime;
  }


  /**
   * Sets the value of the 'channelChangeTime' field.
   * @param value the value to set.
   */
  public void setChannelChangeTime(long value) {
    this.channelChangeTime = value;
  }

  /**
   * Creates a new ReplaceRangeResponse RecordBuilder.
   * @return A new ReplaceRangeResponse RecordBuilder
   */
  public static Energistics.Etp.v12.Protocol.ChannelDataLoad.ReplaceRangeResponse.Builder newBuilder() {
    return new Energistics.Etp.v12.Protocol.ChannelDataLoad.ReplaceRangeResponse.Builder();
  }

  /**
   * Creates a new ReplaceRangeResponse RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new ReplaceRangeResponse RecordBuilder
   */
  public static Energistics.Etp.v12.Protocol.ChannelDataLoad.ReplaceRangeResponse.Builder newBuilder(Energistics.Etp.v12.Protocol.ChannelDataLoad.ReplaceRangeResponse.Builder other) {
    if (other == null) {
      return new Energistics.Etp.v12.Protocol.ChannelDataLoad.ReplaceRangeResponse.Builder();
    } else {
      return new Energistics.Etp.v12.Protocol.ChannelDataLoad.ReplaceRangeResponse.Builder(other);
    }
  }

  /**
   * Creates a new ReplaceRangeResponse RecordBuilder by copying an existing ReplaceRangeResponse instance.
   * @param other The existing instance to copy.
   * @return A new ReplaceRangeResponse RecordBuilder
   */
  public static Energistics.Etp.v12.Protocol.ChannelDataLoad.ReplaceRangeResponse.Builder newBuilder(Energistics.Etp.v12.Protocol.ChannelDataLoad.ReplaceRangeResponse other) {
    if (other == null) {
      return new Energistics.Etp.v12.Protocol.ChannelDataLoad.ReplaceRangeResponse.Builder();
    } else {
      return new Energistics.Etp.v12.Protocol.ChannelDataLoad.ReplaceRangeResponse.Builder(other);
    }
  }

  /**
   * RecordBuilder for ReplaceRangeResponse instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<ReplaceRangeResponse>
    implements org.apache.avro.data.RecordBuilder<ReplaceRangeResponse> {

    private long channelChangeTime;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(Energistics.Etp.v12.Protocol.ChannelDataLoad.ReplaceRangeResponse.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.channelChangeTime)) {
        this.channelChangeTime = data().deepCopy(fields()[0].schema(), other.channelChangeTime);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
    }

    /**
     * Creates a Builder by copying an existing ReplaceRangeResponse instance
     * @param other The existing instance to copy.
     */
    private Builder(Energistics.Etp.v12.Protocol.ChannelDataLoad.ReplaceRangeResponse other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.channelChangeTime)) {
        this.channelChangeTime = data().deepCopy(fields()[0].schema(), other.channelChangeTime);
        fieldSetFlags()[0] = true;
      }
    }

    /**
      * Gets the value of the 'channelChangeTime' field.
      * @return The value.
      */
    public long getChannelChangeTime() {
      return channelChangeTime;
    }


    /**
      * Sets the value of the 'channelChangeTime' field.
      * @param value The value of 'channelChangeTime'.
      * @return This builder.
      */
    public Energistics.Etp.v12.Protocol.ChannelDataLoad.ReplaceRangeResponse.Builder setChannelChangeTime(long value) {
      validate(fields()[0], value);
      this.channelChangeTime = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'channelChangeTime' field has been set.
      * @return True if the 'channelChangeTime' field has been set, false otherwise.
      */
    public boolean hasChannelChangeTime() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'channelChangeTime' field.
      * @return This builder.
      */
    public Energistics.Etp.v12.Protocol.ChannelDataLoad.ReplaceRangeResponse.Builder clearChannelChangeTime() {
      fieldSetFlags()[0] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public ReplaceRangeResponse build() {
      try {
        ReplaceRangeResponse record = new ReplaceRangeResponse();
        record.channelChangeTime = fieldSetFlags()[0] ? this.channelChangeTime : (java.lang.Long) defaultValue(fields()[0]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<ReplaceRangeResponse>
    WRITER$ = (org.apache.avro.io.DatumWriter<ReplaceRangeResponse>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<ReplaceRangeResponse>
    READER$ = (org.apache.avro.io.DatumReader<ReplaceRangeResponse>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    out.writeLong(this.channelChangeTime);

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      this.channelChangeTime = in.readLong();

    } else {
      for (int i = 0; i < 1; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          this.channelChangeTime = in.readLong();
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}









