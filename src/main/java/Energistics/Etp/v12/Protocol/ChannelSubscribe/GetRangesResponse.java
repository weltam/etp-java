/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package Energistics.Etp.v12.Protocol.ChannelSubscribe;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class GetRangesResponse extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 231826296004256251L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"GetRangesResponse\",\"namespace\":\"Energistics.Etp.v12.Protocol.ChannelSubscribe\",\"fields\":[{\"name\":\"data\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"DataItem\",\"namespace\":\"Energistics.Etp.v12.Datatypes.ChannelData\",\"fields\":[{\"name\":\"channelId\",\"type\":\"long\"},{\"name\":\"indexes\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"IndexValue\",\"namespace\":\"Energistics.Etp.v12.Datatypes\",\"fields\":[{\"name\":\"item\",\"type\":[\"null\",\"long\",\"double\",{\"type\":\"record\",\"name\":\"PassIndexedDepth\",\"namespace\":\"Energistics.Etp.v12.Datatypes.ChannelData\",\"fields\":[{\"name\":\"pass\",\"type\":\"long\"},{\"name\":\"direction\",\"type\":{\"type\":\"enum\",\"name\":\"PassDirection\",\"symbols\":[\"Up\",\"HoldingSteady\",\"Down\"],\"fullName\":\"Energistics.Etp.v12.Datatypes.ChannelData.PassDirection\",\"depends\":[]}},{\"name\":\"depth\",\"type\":\"double\"}],\"fullName\":\"Energistics.Etp.v12.Datatypes.ChannelData.PassIndexedDepth\",\"depends\":[\"Energistics.Etp.v12.Datatypes.ChannelData.PassDirection\"]}]}],\"fullName\":\"Energistics.Etp.v12.Datatypes.IndexValue\",\"depends\":[\"Energistics.Etp.v12.Datatypes.ChannelData.PassIndexedDepth\"]}}},{\"name\":\"value\",\"type\":{\"type\":\"record\",\"name\":\"DataValue\",\"namespace\":\"Energistics.Etp.v12.Datatypes\",\"fields\":[{\"name\":\"item\",\"type\":[\"null\",\"boolean\",\"int\",\"long\",\"float\",\"double\",\"string\",{\"type\":\"record\",\"name\":\"ArrayOfBoolean\",\"fields\":[{\"name\":\"values\",\"type\":{\"type\":\"array\",\"items\":\"boolean\"}}],\"fullName\":\"Energistics.Etp.v12.Datatypes.ArrayOfBoolean\",\"depends\":[]},{\"type\":\"record\",\"name\":\"ArrayOfNullableBoolean\",\"fields\":[{\"name\":\"values\",\"type\":{\"type\":\"array\",\"items\":[\"null\",\"boolean\"]}}],\"fullName\":\"Energistics.Etp.v12.Datatypes.ArrayOfNullableBoolean\",\"depends\":[]},{\"type\":\"record\",\"name\":\"ArrayOfInt\",\"fields\":[{\"name\":\"values\",\"type\":{\"type\":\"array\",\"items\":\"int\"}}],\"fullName\":\"Energistics.Etp.v12.Datatypes.ArrayOfInt\",\"depends\":[]},{\"type\":\"record\",\"name\":\"ArrayOfNullableInt\",\"fields\":[{\"name\":\"values\",\"type\":{\"type\":\"array\",\"items\":[\"null\",\"int\"]}}],\"fullName\":\"Energistics.Etp.v12.Datatypes.ArrayOfNullableInt\",\"depends\":[]},{\"type\":\"record\",\"name\":\"ArrayOfLong\",\"fields\":[{\"name\":\"values\",\"type\":{\"type\":\"array\",\"items\":\"long\"}}],\"fullName\":\"Energistics.Etp.v12.Datatypes.ArrayOfLong\",\"depends\":[]},{\"type\":\"record\",\"name\":\"ArrayOfNullableLong\",\"fields\":[{\"name\":\"values\",\"type\":{\"type\":\"array\",\"items\":[\"null\",\"long\"]}}],\"fullName\":\"Energistics.Etp.v12.Datatypes.ArrayOfNullableLong\",\"depends\":[]},{\"type\":\"record\",\"name\":\"ArrayOfFloat\",\"fields\":[{\"name\":\"values\",\"type\":{\"type\":\"array\",\"items\":\"float\"}}],\"fullName\":\"Energistics.Etp.v12.Datatypes.ArrayOfFloat\",\"depends\":[]},{\"type\":\"record\",\"name\":\"ArrayOfDouble\",\"fields\":[{\"name\":\"values\",\"type\":{\"type\":\"array\",\"items\":\"double\"}}],\"fullName\":\"Energistics.Etp.v12.Datatypes.ArrayOfDouble\",\"depends\":[]},{\"type\":\"record\",\"name\":\"ArrayOfString\",\"fields\":[{\"name\":\"values\",\"type\":{\"type\":\"array\",\"items\":\"string\"}}],\"fullName\":\"Energistics.Etp.v12.Datatypes.ArrayOfString\",\"depends\":[]},{\"type\":\"record\",\"name\":\"ArrayOfBytes\",\"fields\":[{\"name\":\"values\",\"type\":{\"type\":\"array\",\"items\":\"bytes\"}}],\"fullName\":\"Energistics.Etp.v12.Datatypes.ArrayOfBytes\",\"depends\":[]},\"bytes\",{\"type\":\"record\",\"name\":\"AnySparseArray\",\"fields\":[{\"name\":\"slices\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"AnySubarray\",\"fields\":[{\"name\":\"start\",\"type\":\"long\"},{\"name\":\"slice\",\"type\":{\"type\":\"record\",\"name\":\"AnyArray\",\"fields\":[{\"name\":\"item\",\"type\":[\"ArrayOfBoolean\",\"ArrayOfInt\",\"ArrayOfLong\",\"ArrayOfFloat\",\"ArrayOfDouble\",\"ArrayOfString\",\"bytes\"]}],\"fullName\":\"Energistics.Etp.v12.Datatypes.AnyArray\",\"depends\":[\"Energistics.Etp.v12.Datatypes.ArrayOfBoolean\",\"Energistics.Etp.v12.Datatypes.ArrayOfInt\",\"Energistics.Etp.v12.Datatypes.ArrayOfLong\",\"Energistics.Etp.v12.Datatypes.ArrayOfFloat\",\"Energistics.Etp.v12.Datatypes.ArrayOfDouble\",\"Energistics.Etp.v12.Datatypes.ArrayOfString\"]}}],\"fullName\":\"Energistics.Etp.v12.Datatypes.AnySubarray\",\"depends\":[\"Energistics.Etp.v12.Datatypes.AnyArray\"]}}}],\"fullName\":\"Energistics.Etp.v12.Datatypes.AnySparseArray\",\"depends\":[\"Energistics.Etp.v12.Datatypes.AnySubarray\"]}]}],\"fullName\":\"Energistics.Etp.v12.Datatypes.DataValue\",\"depends\":[\"Energistics.Etp.v12.Datatypes.ArrayOfBoolean\",\"Energistics.Etp.v12.Datatypes.ArrayOfNullableBoolean\",\"Energistics.Etp.v12.Datatypes.ArrayOfInt\",\"Energistics.Etp.v12.Datatypes.ArrayOfNullableInt\",\"Energistics.Etp.v12.Datatypes.ArrayOfLong\",\"Energistics.Etp.v12.Datatypes.ArrayOfNullableLong\",\"Energistics.Etp.v12.Datatypes.ArrayOfFloat\",\"Energistics.Etp.v12.Datatypes.ArrayOfDouble\",\"Energistics.Etp.v12.Datatypes.ArrayOfString\",\"Energistics.Etp.v12.Datatypes.ArrayOfBytes\",\"Energistics.Etp.v12.Datatypes.AnySparseArray\"]}},{\"name\":\"valueAttributes\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"DataAttribute\",\"namespace\":\"Energistics.Etp.v12.Datatypes\",\"fields\":[{\"name\":\"attributeId\",\"type\":\"int\"},{\"name\":\"attributeValue\",\"type\":\"DataValue\"}],\"fullName\":\"Energistics.Etp.v12.Datatypes.DataAttribute\",\"depends\":[\"Energistics.Etp.v12.Datatypes.DataValue\"]}},\"default\":[]}],\"fullName\":\"Energistics.Etp.v12.Datatypes.ChannelData.DataItem\",\"depends\":[\"Energistics.Etp.v12.Datatypes.IndexValue\",\"Energistics.Etp.v12.Datatypes.DataValue\",\"Energistics.Etp.v12.Datatypes.DataAttribute\"]}},\"default\":[]}],\"protocol\":\"21\",\"messageType\":\"10\",\"senderRole\":\"store\",\"protocolRoles\":\"store,customer\",\"multipartFlag\":true,\"fullName\":\"Energistics.Etp.v12.Protocol.ChannelSubscribe.GetRangesResponse\",\"depends\":[\"Energistics.Etp.v12.Datatypes.ChannelData.DataItem\"]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<GetRangesResponse> ENCODER =
      new BinaryMessageEncoder<GetRangesResponse>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<GetRangesResponse> DECODER =
      new BinaryMessageDecoder<GetRangesResponse>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<GetRangesResponse> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<GetRangesResponse> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<GetRangesResponse> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<GetRangesResponse>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this GetRangesResponse to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a GetRangesResponse from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a GetRangesResponse instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static GetRangesResponse fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

   private java.util.List<Energistics.Etp.v12.Datatypes.ChannelData.DataItem> data;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public GetRangesResponse() {}

  /**
   * All-args constructor.
   * @param data The new value for data
   */
  public GetRangesResponse(java.util.List<Energistics.Etp.v12.Datatypes.ChannelData.DataItem> data) {
    this.data = data;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return data;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: data = (java.util.List<Energistics.Etp.v12.Datatypes.ChannelData.DataItem>)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'data' field.
   * @return The value of the 'data' field.
   */
  public java.util.List<Energistics.Etp.v12.Datatypes.ChannelData.DataItem> getData() {
    return data;
  }


  /**
   * Sets the value of the 'data' field.
   * @param value the value to set.
   */
  public void setData(java.util.List<Energistics.Etp.v12.Datatypes.ChannelData.DataItem> value) {
    this.data = value;
  }

  /**
   * Creates a new GetRangesResponse RecordBuilder.
   * @return A new GetRangesResponse RecordBuilder
   */
  public static Energistics.Etp.v12.Protocol.ChannelSubscribe.GetRangesResponse.Builder newBuilder() {
    return new Energistics.Etp.v12.Protocol.ChannelSubscribe.GetRangesResponse.Builder();
  }

  /**
   * Creates a new GetRangesResponse RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new GetRangesResponse RecordBuilder
   */
  public static Energistics.Etp.v12.Protocol.ChannelSubscribe.GetRangesResponse.Builder newBuilder(Energistics.Etp.v12.Protocol.ChannelSubscribe.GetRangesResponse.Builder other) {
    if (other == null) {
      return new Energistics.Etp.v12.Protocol.ChannelSubscribe.GetRangesResponse.Builder();
    } else {
      return new Energistics.Etp.v12.Protocol.ChannelSubscribe.GetRangesResponse.Builder(other);
    }
  }

  /**
   * Creates a new GetRangesResponse RecordBuilder by copying an existing GetRangesResponse instance.
   * @param other The existing instance to copy.
   * @return A new GetRangesResponse RecordBuilder
   */
  public static Energistics.Etp.v12.Protocol.ChannelSubscribe.GetRangesResponse.Builder newBuilder(Energistics.Etp.v12.Protocol.ChannelSubscribe.GetRangesResponse other) {
    if (other == null) {
      return new Energistics.Etp.v12.Protocol.ChannelSubscribe.GetRangesResponse.Builder();
    } else {
      return new Energistics.Etp.v12.Protocol.ChannelSubscribe.GetRangesResponse.Builder(other);
    }
  }

  /**
   * RecordBuilder for GetRangesResponse instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<GetRangesResponse>
    implements org.apache.avro.data.RecordBuilder<GetRangesResponse> {

    private java.util.List<Energistics.Etp.v12.Datatypes.ChannelData.DataItem> data;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(Energistics.Etp.v12.Protocol.ChannelSubscribe.GetRangesResponse.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.data)) {
        this.data = data().deepCopy(fields()[0].schema(), other.data);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
    }

    /**
     * Creates a Builder by copying an existing GetRangesResponse instance
     * @param other The existing instance to copy.
     */
    private Builder(Energistics.Etp.v12.Protocol.ChannelSubscribe.GetRangesResponse other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.data)) {
        this.data = data().deepCopy(fields()[0].schema(), other.data);
        fieldSetFlags()[0] = true;
      }
    }

    /**
      * Gets the value of the 'data' field.
      * @return The value.
      */
    public java.util.List<Energistics.Etp.v12.Datatypes.ChannelData.DataItem> getData() {
      return data;
    }


    /**
      * Sets the value of the 'data' field.
      * @param value The value of 'data'.
      * @return This builder.
      */
    public Energistics.Etp.v12.Protocol.ChannelSubscribe.GetRangesResponse.Builder setData(java.util.List<Energistics.Etp.v12.Datatypes.ChannelData.DataItem> value) {
      validate(fields()[0], value);
      this.data = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'data' field has been set.
      * @return True if the 'data' field has been set, false otherwise.
      */
    public boolean hasData() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'data' field.
      * @return This builder.
      */
    public Energistics.Etp.v12.Protocol.ChannelSubscribe.GetRangesResponse.Builder clearData() {
      data = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public GetRangesResponse build() {
      try {
        GetRangesResponse record = new GetRangesResponse();
        record.data = fieldSetFlags()[0] ? this.data : (java.util.List<Energistics.Etp.v12.Datatypes.ChannelData.DataItem>) defaultValue(fields()[0]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<GetRangesResponse>
    WRITER$ = (org.apache.avro.io.DatumWriter<GetRangesResponse>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<GetRangesResponse>
    READER$ = (org.apache.avro.io.DatumReader<GetRangesResponse>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}










