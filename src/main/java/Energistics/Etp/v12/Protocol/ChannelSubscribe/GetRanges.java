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
public class GetRanges extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 7622966303518421683L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"GetRanges\",\"namespace\":\"Energistics.Etp.v12.Protocol.ChannelSubscribe\",\"fields\":[{\"name\":\"requestUuid\",\"type\":{\"type\":\"fixed\",\"name\":\"Uuid\",\"namespace\":\"Energistics.Etp.v12.Datatypes\",\"size\":16,\"fullName\":\"Energistics.Etp.v12.Datatypes.Uuid\",\"depends\":[]}},{\"name\":\"channelRanges\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"ChannelRangeInfo\",\"namespace\":\"Energistics.Etp.v12.Datatypes.ChannelData\",\"fields\":[{\"name\":\"channelIds\",\"type\":{\"type\":\"array\",\"items\":\"long\"}},{\"name\":\"interval\",\"type\":{\"type\":\"record\",\"name\":\"IndexInterval\",\"namespace\":\"Energistics.Etp.v12.Datatypes.Object\",\"fields\":[{\"name\":\"startIndex\",\"type\":{\"type\":\"record\",\"name\":\"IndexValue\",\"namespace\":\"Energistics.Etp.v12.Datatypes\",\"fields\":[{\"name\":\"item\",\"type\":[\"null\",\"long\",\"double\",{\"type\":\"record\",\"name\":\"PassIndexedDepth\",\"namespace\":\"Energistics.Etp.v12.Datatypes.ChannelData\",\"fields\":[{\"name\":\"pass\",\"type\":\"long\"},{\"name\":\"direction\",\"type\":{\"type\":\"enum\",\"name\":\"PassDirection\",\"symbols\":[\"Up\",\"HoldingSteady\",\"Down\"],\"fullName\":\"Energistics.Etp.v12.Datatypes.ChannelData.PassDirection\",\"depends\":[]}},{\"name\":\"depth\",\"type\":\"double\"}],\"fullName\":\"Energistics.Etp.v12.Datatypes.ChannelData.PassIndexedDepth\",\"depends\":[\"Energistics.Etp.v12.Datatypes.ChannelData.PassDirection\"]}]}],\"fullName\":\"Energistics.Etp.v12.Datatypes.IndexValue\",\"depends\":[\"Energistics.Etp.v12.Datatypes.ChannelData.PassIndexedDepth\"]}},{\"name\":\"endIndex\",\"type\":\"Energistics.Etp.v12.Datatypes.IndexValue\"},{\"name\":\"uom\",\"type\":\"string\"},{\"name\":\"depthDatum\",\"type\":\"string\",\"default\":\"\"}],\"fullName\":\"Energistics.Etp.v12.Datatypes.Object.IndexInterval\",\"depends\":[\"Energistics.Etp.v12.Datatypes.IndexValue\",\"Energistics.Etp.v12.Datatypes.IndexValue\"]}},{\"name\":\"secondaryIntervals\",\"type\":{\"type\":\"array\",\"items\":\"Energistics.Etp.v12.Datatypes.Object.IndexInterval\"},\"default\":[]}],\"fullName\":\"Energistics.Etp.v12.Datatypes.ChannelData.ChannelRangeInfo\",\"depends\":[\"Energistics.Etp.v12.Datatypes.Object.IndexInterval\",\"Energistics.Etp.v12.Datatypes.Object.IndexInterval\"]}}}],\"protocol\":\"21\",\"messageType\":\"9\",\"senderRole\":\"customer\",\"protocolRoles\":\"store,customer\",\"multipartFlag\":false,\"fullName\":\"Energistics.Etp.v12.Protocol.ChannelSubscribe.GetRanges\",\"depends\":[\"Energistics.Etp.v12.Datatypes.Uuid\",\"Energistics.Etp.v12.Datatypes.ChannelData.ChannelRangeInfo\"]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<GetRanges> ENCODER =
      new BinaryMessageEncoder<GetRanges>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<GetRanges> DECODER =
      new BinaryMessageDecoder<GetRanges>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<GetRanges> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<GetRanges> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<GetRanges> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<GetRanges>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this GetRanges to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a GetRanges from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a GetRanges instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static GetRanges fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

   private Energistics.Etp.v12.Datatypes.Uuid requestUuid;
   private java.util.List<Energistics.Etp.v12.Datatypes.ChannelData.ChannelRangeInfo> channelRanges;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public GetRanges() {}

  /**
   * All-args constructor.
   * @param requestUuid The new value for requestUuid
   * @param channelRanges The new value for channelRanges
   */
  public GetRanges(Energistics.Etp.v12.Datatypes.Uuid requestUuid, java.util.List<Energistics.Etp.v12.Datatypes.ChannelData.ChannelRangeInfo> channelRanges) {
    this.requestUuid = requestUuid;
    this.channelRanges = channelRanges;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return requestUuid;
    case 1: return channelRanges;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: requestUuid = (Energistics.Etp.v12.Datatypes.Uuid)value$; break;
    case 1: channelRanges = (java.util.List<Energistics.Etp.v12.Datatypes.ChannelData.ChannelRangeInfo>)value$; break;
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
   * Gets the value of the 'channelRanges' field.
   * @return The value of the 'channelRanges' field.
   */
  public java.util.List<Energistics.Etp.v12.Datatypes.ChannelData.ChannelRangeInfo> getChannelRanges() {
    return channelRanges;
  }


  /**
   * Sets the value of the 'channelRanges' field.
   * @param value the value to set.
   */
  public void setChannelRanges(java.util.List<Energistics.Etp.v12.Datatypes.ChannelData.ChannelRangeInfo> value) {
    this.channelRanges = value;
  }

  /**
   * Creates a new GetRanges RecordBuilder.
   * @return A new GetRanges RecordBuilder
   */
  public static Energistics.Etp.v12.Protocol.ChannelSubscribe.GetRanges.Builder newBuilder() {
    return new Energistics.Etp.v12.Protocol.ChannelSubscribe.GetRanges.Builder();
  }

  /**
   * Creates a new GetRanges RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new GetRanges RecordBuilder
   */
  public static Energistics.Etp.v12.Protocol.ChannelSubscribe.GetRanges.Builder newBuilder(Energistics.Etp.v12.Protocol.ChannelSubscribe.GetRanges.Builder other) {
    if (other == null) {
      return new Energistics.Etp.v12.Protocol.ChannelSubscribe.GetRanges.Builder();
    } else {
      return new Energistics.Etp.v12.Protocol.ChannelSubscribe.GetRanges.Builder(other);
    }
  }

  /**
   * Creates a new GetRanges RecordBuilder by copying an existing GetRanges instance.
   * @param other The existing instance to copy.
   * @return A new GetRanges RecordBuilder
   */
  public static Energistics.Etp.v12.Protocol.ChannelSubscribe.GetRanges.Builder newBuilder(Energistics.Etp.v12.Protocol.ChannelSubscribe.GetRanges other) {
    if (other == null) {
      return new Energistics.Etp.v12.Protocol.ChannelSubscribe.GetRanges.Builder();
    } else {
      return new Energistics.Etp.v12.Protocol.ChannelSubscribe.GetRanges.Builder(other);
    }
  }

  /**
   * RecordBuilder for GetRanges instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<GetRanges>
    implements org.apache.avro.data.RecordBuilder<GetRanges> {

    private Energistics.Etp.v12.Datatypes.Uuid requestUuid;
    private java.util.List<Energistics.Etp.v12.Datatypes.ChannelData.ChannelRangeInfo> channelRanges;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(Energistics.Etp.v12.Protocol.ChannelSubscribe.GetRanges.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.requestUuid)) {
        this.requestUuid = data().deepCopy(fields()[0].schema(), other.requestUuid);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.channelRanges)) {
        this.channelRanges = data().deepCopy(fields()[1].schema(), other.channelRanges);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
    }

    /**
     * Creates a Builder by copying an existing GetRanges instance
     * @param other The existing instance to copy.
     */
    private Builder(Energistics.Etp.v12.Protocol.ChannelSubscribe.GetRanges other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.requestUuid)) {
        this.requestUuid = data().deepCopy(fields()[0].schema(), other.requestUuid);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.channelRanges)) {
        this.channelRanges = data().deepCopy(fields()[1].schema(), other.channelRanges);
        fieldSetFlags()[1] = true;
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
    public Energistics.Etp.v12.Protocol.ChannelSubscribe.GetRanges.Builder setRequestUuid(Energistics.Etp.v12.Datatypes.Uuid value) {
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
    public Energistics.Etp.v12.Protocol.ChannelSubscribe.GetRanges.Builder clearRequestUuid() {
      requestUuid = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'channelRanges' field.
      * @return The value.
      */
    public java.util.List<Energistics.Etp.v12.Datatypes.ChannelData.ChannelRangeInfo> getChannelRanges() {
      return channelRanges;
    }


    /**
      * Sets the value of the 'channelRanges' field.
      * @param value The value of 'channelRanges'.
      * @return This builder.
      */
    public Energistics.Etp.v12.Protocol.ChannelSubscribe.GetRanges.Builder setChannelRanges(java.util.List<Energistics.Etp.v12.Datatypes.ChannelData.ChannelRangeInfo> value) {
      validate(fields()[1], value);
      this.channelRanges = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'channelRanges' field has been set.
      * @return True if the 'channelRanges' field has been set, false otherwise.
      */
    public boolean hasChannelRanges() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'channelRanges' field.
      * @return This builder.
      */
    public Energistics.Etp.v12.Protocol.ChannelSubscribe.GetRanges.Builder clearChannelRanges() {
      channelRanges = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public GetRanges build() {
      try {
        GetRanges record = new GetRanges();
        record.requestUuid = fieldSetFlags()[0] ? this.requestUuid : (Energistics.Etp.v12.Datatypes.Uuid) defaultValue(fields()[0]);
        record.channelRanges = fieldSetFlags()[1] ? this.channelRanges : (java.util.List<Energistics.Etp.v12.Datatypes.ChannelData.ChannelRangeInfo>) defaultValue(fields()[1]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<GetRanges>
    WRITER$ = (org.apache.avro.io.DatumWriter<GetRanges>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<GetRanges>
    READER$ = (org.apache.avro.io.DatumReader<GetRanges>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}










