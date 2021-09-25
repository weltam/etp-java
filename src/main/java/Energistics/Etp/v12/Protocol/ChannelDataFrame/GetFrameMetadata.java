/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package Energistics.Etp.v12.Protocol.ChannelDataFrame;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class GetFrameMetadata extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -2848756563952441287L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"GetFrameMetadata\",\"namespace\":\"Energistics.Etp.v12.Protocol.ChannelDataFrame\",\"fields\":[{\"name\":\"uri\",\"type\":\"string\"},{\"name\":\"includeAllChannelSecondaryIndexes\",\"type\":\"boolean\",\"default\":false}],\"protocol\":\"2\",\"messageType\":\"1\",\"senderRole\":\"customer\",\"protocolRoles\":\"store,customer\",\"multipartFlag\":false,\"fullName\":\"Energistics.Etp.v12.Protocol.ChannelDataFrame.GetFrameMetadata\",\"depends\":[]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<GetFrameMetadata> ENCODER =
      new BinaryMessageEncoder<GetFrameMetadata>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<GetFrameMetadata> DECODER =
      new BinaryMessageDecoder<GetFrameMetadata>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<GetFrameMetadata> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<GetFrameMetadata> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<GetFrameMetadata> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<GetFrameMetadata>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this GetFrameMetadata to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a GetFrameMetadata from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a GetFrameMetadata instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static GetFrameMetadata fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

   private java.lang.CharSequence uri;
   private boolean includeAllChannelSecondaryIndexes;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public GetFrameMetadata() {}

  /**
   * All-args constructor.
   * @param uri The new value for uri
   * @param includeAllChannelSecondaryIndexes The new value for includeAllChannelSecondaryIndexes
   */
  public GetFrameMetadata(java.lang.CharSequence uri, java.lang.Boolean includeAllChannelSecondaryIndexes) {
    this.uri = uri;
    this.includeAllChannelSecondaryIndexes = includeAllChannelSecondaryIndexes;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return uri;
    case 1: return includeAllChannelSecondaryIndexes;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: uri = (java.lang.CharSequence)value$; break;
    case 1: includeAllChannelSecondaryIndexes = (java.lang.Boolean)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'uri' field.
   * @return The value of the 'uri' field.
   */
  public java.lang.CharSequence getUri() {
    return uri;
  }


  /**
   * Sets the value of the 'uri' field.
   * @param value the value to set.
   */
  public void setUri(java.lang.CharSequence value) {
    this.uri = value;
  }

  /**
   * Gets the value of the 'includeAllChannelSecondaryIndexes' field.
   * @return The value of the 'includeAllChannelSecondaryIndexes' field.
   */
  public boolean getIncludeAllChannelSecondaryIndexes() {
    return includeAllChannelSecondaryIndexes;
  }


  /**
   * Sets the value of the 'includeAllChannelSecondaryIndexes' field.
   * @param value the value to set.
   */
  public void setIncludeAllChannelSecondaryIndexes(boolean value) {
    this.includeAllChannelSecondaryIndexes = value;
  }

  /**
   * Creates a new GetFrameMetadata RecordBuilder.
   * @return A new GetFrameMetadata RecordBuilder
   */
  public static Energistics.Etp.v12.Protocol.ChannelDataFrame.GetFrameMetadata.Builder newBuilder() {
    return new Energistics.Etp.v12.Protocol.ChannelDataFrame.GetFrameMetadata.Builder();
  }

  /**
   * Creates a new GetFrameMetadata RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new GetFrameMetadata RecordBuilder
   */
  public static Energistics.Etp.v12.Protocol.ChannelDataFrame.GetFrameMetadata.Builder newBuilder(Energistics.Etp.v12.Protocol.ChannelDataFrame.GetFrameMetadata.Builder other) {
    if (other == null) {
      return new Energistics.Etp.v12.Protocol.ChannelDataFrame.GetFrameMetadata.Builder();
    } else {
      return new Energistics.Etp.v12.Protocol.ChannelDataFrame.GetFrameMetadata.Builder(other);
    }
  }

  /**
   * Creates a new GetFrameMetadata RecordBuilder by copying an existing GetFrameMetadata instance.
   * @param other The existing instance to copy.
   * @return A new GetFrameMetadata RecordBuilder
   */
  public static Energistics.Etp.v12.Protocol.ChannelDataFrame.GetFrameMetadata.Builder newBuilder(Energistics.Etp.v12.Protocol.ChannelDataFrame.GetFrameMetadata other) {
    if (other == null) {
      return new Energistics.Etp.v12.Protocol.ChannelDataFrame.GetFrameMetadata.Builder();
    } else {
      return new Energistics.Etp.v12.Protocol.ChannelDataFrame.GetFrameMetadata.Builder(other);
    }
  }

  /**
   * RecordBuilder for GetFrameMetadata instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<GetFrameMetadata>
    implements org.apache.avro.data.RecordBuilder<GetFrameMetadata> {

    private java.lang.CharSequence uri;
    private boolean includeAllChannelSecondaryIndexes;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(Energistics.Etp.v12.Protocol.ChannelDataFrame.GetFrameMetadata.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.uri)) {
        this.uri = data().deepCopy(fields()[0].schema(), other.uri);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.includeAllChannelSecondaryIndexes)) {
        this.includeAllChannelSecondaryIndexes = data().deepCopy(fields()[1].schema(), other.includeAllChannelSecondaryIndexes);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
    }

    /**
     * Creates a Builder by copying an existing GetFrameMetadata instance
     * @param other The existing instance to copy.
     */
    private Builder(Energistics.Etp.v12.Protocol.ChannelDataFrame.GetFrameMetadata other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.uri)) {
        this.uri = data().deepCopy(fields()[0].schema(), other.uri);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.includeAllChannelSecondaryIndexes)) {
        this.includeAllChannelSecondaryIndexes = data().deepCopy(fields()[1].schema(), other.includeAllChannelSecondaryIndexes);
        fieldSetFlags()[1] = true;
      }
    }

    /**
      * Gets the value of the 'uri' field.
      * @return The value.
      */
    public java.lang.CharSequence getUri() {
      return uri;
    }


    /**
      * Sets the value of the 'uri' field.
      * @param value The value of 'uri'.
      * @return This builder.
      */
    public Energistics.Etp.v12.Protocol.ChannelDataFrame.GetFrameMetadata.Builder setUri(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.uri = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'uri' field has been set.
      * @return True if the 'uri' field has been set, false otherwise.
      */
    public boolean hasUri() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'uri' field.
      * @return This builder.
      */
    public Energistics.Etp.v12.Protocol.ChannelDataFrame.GetFrameMetadata.Builder clearUri() {
      uri = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'includeAllChannelSecondaryIndexes' field.
      * @return The value.
      */
    public boolean getIncludeAllChannelSecondaryIndexes() {
      return includeAllChannelSecondaryIndexes;
    }


    /**
      * Sets the value of the 'includeAllChannelSecondaryIndexes' field.
      * @param value The value of 'includeAllChannelSecondaryIndexes'.
      * @return This builder.
      */
    public Energistics.Etp.v12.Protocol.ChannelDataFrame.GetFrameMetadata.Builder setIncludeAllChannelSecondaryIndexes(boolean value) {
      validate(fields()[1], value);
      this.includeAllChannelSecondaryIndexes = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'includeAllChannelSecondaryIndexes' field has been set.
      * @return True if the 'includeAllChannelSecondaryIndexes' field has been set, false otherwise.
      */
    public boolean hasIncludeAllChannelSecondaryIndexes() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'includeAllChannelSecondaryIndexes' field.
      * @return This builder.
      */
    public Energistics.Etp.v12.Protocol.ChannelDataFrame.GetFrameMetadata.Builder clearIncludeAllChannelSecondaryIndexes() {
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public GetFrameMetadata build() {
      try {
        GetFrameMetadata record = new GetFrameMetadata();
        record.uri = fieldSetFlags()[0] ? this.uri : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.includeAllChannelSecondaryIndexes = fieldSetFlags()[1] ? this.includeAllChannelSecondaryIndexes : (java.lang.Boolean) defaultValue(fields()[1]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<GetFrameMetadata>
    WRITER$ = (org.apache.avro.io.DatumWriter<GetFrameMetadata>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<GetFrameMetadata>
    READER$ = (org.apache.avro.io.DatumReader<GetFrameMetadata>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    out.writeString(this.uri);

    out.writeBoolean(this.includeAllChannelSecondaryIndexes);

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      this.uri = in.readString(this.uri instanceof Utf8 ? (Utf8)this.uri : null);

      this.includeAllChannelSecondaryIndexes = in.readBoolean();

    } else {
      for (int i = 0; i < 2; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          this.uri = in.readString(this.uri instanceof Utf8 ? (Utf8)this.uri : null);
          break;

        case 1:
          this.includeAllChannelSecondaryIndexes = in.readBoolean();
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}










