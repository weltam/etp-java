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
public class GetFrameResponseHeader extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 4919616833522064155L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"GetFrameResponseHeader\",\"namespace\":\"Energistics.Etp.v12.Protocol.ChannelDataFrame\",\"fields\":[{\"name\":\"channelUris\",\"type\":{\"type\":\"array\",\"items\":\"string\"}},{\"name\":\"indexes\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"IndexMetadataRecord\",\"namespace\":\"Energistics.Etp.v12.Datatypes.ChannelData\",\"fields\":[{\"name\":\"indexKind\",\"type\":{\"type\":\"enum\",\"name\":\"ChannelIndexKind\",\"symbols\":[\"DateTime\",\"ElapsedTime\",\"MeasuredDepth\",\"TrueVerticalDepth\",\"PassIndexedDepth\",\"Pressure\",\"Temperature\",\"Scalar\"],\"fullName\":\"Energistics.Etp.v12.Datatypes.ChannelData.ChannelIndexKind\",\"depends\":[]},\"default\":\"DateTime\"},{\"name\":\"interval\",\"type\":{\"type\":\"record\",\"name\":\"IndexInterval\",\"namespace\":\"Energistics.Etp.v12.Datatypes.Object\",\"fields\":[{\"name\":\"startIndex\",\"type\":{\"type\":\"record\",\"name\":\"IndexValue\",\"namespace\":\"Energistics.Etp.v12.Datatypes\",\"fields\":[{\"name\":\"item\",\"type\":[\"null\",\"long\",\"double\",{\"type\":\"record\",\"name\":\"PassIndexedDepth\",\"namespace\":\"Energistics.Etp.v12.Datatypes.ChannelData\",\"fields\":[{\"name\":\"pass\",\"type\":\"long\"},{\"name\":\"direction\",\"type\":{\"type\":\"enum\",\"name\":\"PassDirection\",\"symbols\":[\"Up\",\"HoldingSteady\",\"Down\"],\"fullName\":\"Energistics.Etp.v12.Datatypes.ChannelData.PassDirection\",\"depends\":[]}},{\"name\":\"depth\",\"type\":\"double\"}],\"fullName\":\"Energistics.Etp.v12.Datatypes.ChannelData.PassIndexedDepth\",\"depends\":[\"Energistics.Etp.v12.Datatypes.ChannelData.PassDirection\"]}]}],\"fullName\":\"Energistics.Etp.v12.Datatypes.IndexValue\",\"depends\":[\"Energistics.Etp.v12.Datatypes.ChannelData.PassIndexedDepth\"]}},{\"name\":\"endIndex\",\"type\":\"Energistics.Etp.v12.Datatypes.IndexValue\"},{\"name\":\"uom\",\"type\":\"string\"},{\"name\":\"depthDatum\",\"type\":\"string\",\"default\":\"\"}],\"fullName\":\"Energistics.Etp.v12.Datatypes.Object.IndexInterval\",\"depends\":[\"Energistics.Etp.v12.Datatypes.IndexValue\",\"Energistics.Etp.v12.Datatypes.IndexValue\"]}},{\"name\":\"direction\",\"type\":{\"type\":\"enum\",\"name\":\"IndexDirection\",\"symbols\":[\"Increasing\",\"Decreasing\",\"Unordered\"],\"fullName\":\"Energistics.Etp.v12.Datatypes.ChannelData.IndexDirection\",\"depends\":[]},\"default\":\"Increasing\"},{\"name\":\"name\",\"type\":\"string\",\"default\":\"\"},{\"name\":\"uom\",\"type\":\"string\"},{\"name\":\"depthDatum\",\"type\":\"string\",\"default\":\"\"},{\"name\":\"indexPropertyKindUri\",\"type\":\"string\"},{\"name\":\"filterable\",\"type\":\"boolean\",\"default\":true}],\"fullName\":\"Energistics.Etp.v12.Datatypes.ChannelData.IndexMetadataRecord\",\"depends\":[\"Energistics.Etp.v12.Datatypes.ChannelData.ChannelIndexKind\",\"Energistics.Etp.v12.Datatypes.Object.IndexInterval\",\"Energistics.Etp.v12.Datatypes.ChannelData.IndexDirection\"]}}}],\"protocol\":\"2\",\"messageType\":\"4\",\"senderRole\":\"store\",\"protocolRoles\":\"store,customer\",\"multipartFlag\":true,\"fullName\":\"Energistics.Etp.v12.Protocol.ChannelDataFrame.GetFrameResponseHeader\",\"depends\":[\"Energistics.Etp.v12.Datatypes.ChannelData.IndexMetadataRecord\"]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<GetFrameResponseHeader> ENCODER =
      new BinaryMessageEncoder<GetFrameResponseHeader>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<GetFrameResponseHeader> DECODER =
      new BinaryMessageDecoder<GetFrameResponseHeader>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<GetFrameResponseHeader> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<GetFrameResponseHeader> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<GetFrameResponseHeader> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<GetFrameResponseHeader>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this GetFrameResponseHeader to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a GetFrameResponseHeader from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a GetFrameResponseHeader instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static GetFrameResponseHeader fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

   private java.util.List<java.lang.CharSequence> channelUris;
   private java.util.List<Energistics.Etp.v12.Datatypes.ChannelData.IndexMetadataRecord> indexes;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public GetFrameResponseHeader() {}

  /**
   * All-args constructor.
   * @param channelUris The new value for channelUris
   * @param indexes The new value for indexes
   */
  public GetFrameResponseHeader(java.util.List<java.lang.CharSequence> channelUris, java.util.List<Energistics.Etp.v12.Datatypes.ChannelData.IndexMetadataRecord> indexes) {
    this.channelUris = channelUris;
    this.indexes = indexes;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return channelUris;
    case 1: return indexes;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: channelUris = (java.util.List<java.lang.CharSequence>)value$; break;
    case 1: indexes = (java.util.List<Energistics.Etp.v12.Datatypes.ChannelData.IndexMetadataRecord>)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'channelUris' field.
   * @return The value of the 'channelUris' field.
   */
  public java.util.List<java.lang.CharSequence> getChannelUris() {
    return channelUris;
  }


  /**
   * Sets the value of the 'channelUris' field.
   * @param value the value to set.
   */
  public void setChannelUris(java.util.List<java.lang.CharSequence> value) {
    this.channelUris = value;
  }

  /**
   * Gets the value of the 'indexes' field.
   * @return The value of the 'indexes' field.
   */
  public java.util.List<Energistics.Etp.v12.Datatypes.ChannelData.IndexMetadataRecord> getIndexes() {
    return indexes;
  }


  /**
   * Sets the value of the 'indexes' field.
   * @param value the value to set.
   */
  public void setIndexes(java.util.List<Energistics.Etp.v12.Datatypes.ChannelData.IndexMetadataRecord> value) {
    this.indexes = value;
  }

  /**
   * Creates a new GetFrameResponseHeader RecordBuilder.
   * @return A new GetFrameResponseHeader RecordBuilder
   */
  public static Energistics.Etp.v12.Protocol.ChannelDataFrame.GetFrameResponseHeader.Builder newBuilder() {
    return new Energistics.Etp.v12.Protocol.ChannelDataFrame.GetFrameResponseHeader.Builder();
  }

  /**
   * Creates a new GetFrameResponseHeader RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new GetFrameResponseHeader RecordBuilder
   */
  public static Energistics.Etp.v12.Protocol.ChannelDataFrame.GetFrameResponseHeader.Builder newBuilder(Energistics.Etp.v12.Protocol.ChannelDataFrame.GetFrameResponseHeader.Builder other) {
    if (other == null) {
      return new Energistics.Etp.v12.Protocol.ChannelDataFrame.GetFrameResponseHeader.Builder();
    } else {
      return new Energistics.Etp.v12.Protocol.ChannelDataFrame.GetFrameResponseHeader.Builder(other);
    }
  }

  /**
   * Creates a new GetFrameResponseHeader RecordBuilder by copying an existing GetFrameResponseHeader instance.
   * @param other The existing instance to copy.
   * @return A new GetFrameResponseHeader RecordBuilder
   */
  public static Energistics.Etp.v12.Protocol.ChannelDataFrame.GetFrameResponseHeader.Builder newBuilder(Energistics.Etp.v12.Protocol.ChannelDataFrame.GetFrameResponseHeader other) {
    if (other == null) {
      return new Energistics.Etp.v12.Protocol.ChannelDataFrame.GetFrameResponseHeader.Builder();
    } else {
      return new Energistics.Etp.v12.Protocol.ChannelDataFrame.GetFrameResponseHeader.Builder(other);
    }
  }

  /**
   * RecordBuilder for GetFrameResponseHeader instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<GetFrameResponseHeader>
    implements org.apache.avro.data.RecordBuilder<GetFrameResponseHeader> {

    private java.util.List<java.lang.CharSequence> channelUris;
    private java.util.List<Energistics.Etp.v12.Datatypes.ChannelData.IndexMetadataRecord> indexes;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(Energistics.Etp.v12.Protocol.ChannelDataFrame.GetFrameResponseHeader.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.channelUris)) {
        this.channelUris = data().deepCopy(fields()[0].schema(), other.channelUris);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.indexes)) {
        this.indexes = data().deepCopy(fields()[1].schema(), other.indexes);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
    }

    /**
     * Creates a Builder by copying an existing GetFrameResponseHeader instance
     * @param other The existing instance to copy.
     */
    private Builder(Energistics.Etp.v12.Protocol.ChannelDataFrame.GetFrameResponseHeader other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.channelUris)) {
        this.channelUris = data().deepCopy(fields()[0].schema(), other.channelUris);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.indexes)) {
        this.indexes = data().deepCopy(fields()[1].schema(), other.indexes);
        fieldSetFlags()[1] = true;
      }
    }

    /**
      * Gets the value of the 'channelUris' field.
      * @return The value.
      */
    public java.util.List<java.lang.CharSequence> getChannelUris() {
      return channelUris;
    }


    /**
      * Sets the value of the 'channelUris' field.
      * @param value The value of 'channelUris'.
      * @return This builder.
      */
    public Energistics.Etp.v12.Protocol.ChannelDataFrame.GetFrameResponseHeader.Builder setChannelUris(java.util.List<java.lang.CharSequence> value) {
      validate(fields()[0], value);
      this.channelUris = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'channelUris' field has been set.
      * @return True if the 'channelUris' field has been set, false otherwise.
      */
    public boolean hasChannelUris() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'channelUris' field.
      * @return This builder.
      */
    public Energistics.Etp.v12.Protocol.ChannelDataFrame.GetFrameResponseHeader.Builder clearChannelUris() {
      channelUris = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'indexes' field.
      * @return The value.
      */
    public java.util.List<Energistics.Etp.v12.Datatypes.ChannelData.IndexMetadataRecord> getIndexes() {
      return indexes;
    }


    /**
      * Sets the value of the 'indexes' field.
      * @param value The value of 'indexes'.
      * @return This builder.
      */
    public Energistics.Etp.v12.Protocol.ChannelDataFrame.GetFrameResponseHeader.Builder setIndexes(java.util.List<Energistics.Etp.v12.Datatypes.ChannelData.IndexMetadataRecord> value) {
      validate(fields()[1], value);
      this.indexes = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'indexes' field has been set.
      * @return True if the 'indexes' field has been set, false otherwise.
      */
    public boolean hasIndexes() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'indexes' field.
      * @return This builder.
      */
    public Energistics.Etp.v12.Protocol.ChannelDataFrame.GetFrameResponseHeader.Builder clearIndexes() {
      indexes = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public GetFrameResponseHeader build() {
      try {
        GetFrameResponseHeader record = new GetFrameResponseHeader();
        record.channelUris = fieldSetFlags()[0] ? this.channelUris : (java.util.List<java.lang.CharSequence>) defaultValue(fields()[0]);
        record.indexes = fieldSetFlags()[1] ? this.indexes : (java.util.List<Energistics.Etp.v12.Datatypes.ChannelData.IndexMetadataRecord>) defaultValue(fields()[1]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<GetFrameResponseHeader>
    WRITER$ = (org.apache.avro.io.DatumWriter<GetFrameResponseHeader>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<GetFrameResponseHeader>
    READER$ = (org.apache.avro.io.DatumReader<GetFrameResponseHeader>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}










