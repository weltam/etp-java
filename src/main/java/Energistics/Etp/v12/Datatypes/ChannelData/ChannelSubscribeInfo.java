/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package Energistics.Etp.v12.Datatypes.ChannelData;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class ChannelSubscribeInfo extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -8540339087305941505L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"ChannelSubscribeInfo\",\"namespace\":\"Energistics.Etp.v12.Datatypes.ChannelData\",\"fields\":[{\"name\":\"channelId\",\"type\":\"long\"},{\"name\":\"startIndex\",\"type\":{\"type\":\"record\",\"name\":\"IndexValue\",\"namespace\":\"Energistics.Etp.v12.Datatypes\",\"fields\":[{\"name\":\"item\",\"type\":[\"null\",\"long\",\"double\",{\"type\":\"record\",\"name\":\"PassIndexedDepth\",\"namespace\":\"Energistics.Etp.v12.Datatypes.ChannelData\",\"fields\":[{\"name\":\"pass\",\"type\":\"long\"},{\"name\":\"direction\",\"type\":{\"type\":\"enum\",\"name\":\"PassDirection\",\"symbols\":[\"Up\",\"HoldingSteady\",\"Down\"],\"fullName\":\"Energistics.Etp.v12.Datatypes.ChannelData.PassDirection\",\"depends\":[]}},{\"name\":\"depth\",\"type\":\"double\"}],\"fullName\":\"Energistics.Etp.v12.Datatypes.ChannelData.PassIndexedDepth\",\"depends\":[\"Energistics.Etp.v12.Datatypes.ChannelData.PassDirection\"]}]}],\"fullName\":\"Energistics.Etp.v12.Datatypes.IndexValue\",\"depends\":[\"Energistics.Etp.v12.Datatypes.ChannelData.PassIndexedDepth\"]}},{\"name\":\"dataChanges\",\"type\":\"boolean\",\"default\":true},{\"name\":\"requestLatestIndexCount\",\"type\":[\"null\",\"int\"]}],\"fullName\":\"Energistics.Etp.v12.Datatypes.ChannelData.ChannelSubscribeInfo\",\"depends\":[\"Energistics.Etp.v12.Datatypes.IndexValue\"]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<ChannelSubscribeInfo> ENCODER =
      new BinaryMessageEncoder<ChannelSubscribeInfo>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<ChannelSubscribeInfo> DECODER =
      new BinaryMessageDecoder<ChannelSubscribeInfo>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<ChannelSubscribeInfo> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<ChannelSubscribeInfo> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<ChannelSubscribeInfo> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<ChannelSubscribeInfo>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this ChannelSubscribeInfo to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a ChannelSubscribeInfo from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a ChannelSubscribeInfo instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static ChannelSubscribeInfo fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

   private long channelId;
   private Energistics.Etp.v12.Datatypes.IndexValue startIndex;
   private boolean dataChanges;
   private java.lang.Integer requestLatestIndexCount;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public ChannelSubscribeInfo() {}

  /**
   * All-args constructor.
   * @param channelId The new value for channelId
   * @param startIndex The new value for startIndex
   * @param dataChanges The new value for dataChanges
   * @param requestLatestIndexCount The new value for requestLatestIndexCount
   */
  public ChannelSubscribeInfo(java.lang.Long channelId, Energistics.Etp.v12.Datatypes.IndexValue startIndex, java.lang.Boolean dataChanges, java.lang.Integer requestLatestIndexCount) {
    this.channelId = channelId;
    this.startIndex = startIndex;
    this.dataChanges = dataChanges;
    this.requestLatestIndexCount = requestLatestIndexCount;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return channelId;
    case 1: return startIndex;
    case 2: return dataChanges;
    case 3: return requestLatestIndexCount;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: channelId = (java.lang.Long)value$; break;
    case 1: startIndex = (Energistics.Etp.v12.Datatypes.IndexValue)value$; break;
    case 2: dataChanges = (java.lang.Boolean)value$; break;
    case 3: requestLatestIndexCount = (java.lang.Integer)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'channelId' field.
   * @return The value of the 'channelId' field.
   */
  public long getChannelId() {
    return channelId;
  }


  /**
   * Sets the value of the 'channelId' field.
   * @param value the value to set.
   */
  public void setChannelId(long value) {
    this.channelId = value;
  }

  /**
   * Gets the value of the 'startIndex' field.
   * @return The value of the 'startIndex' field.
   */
  public Energistics.Etp.v12.Datatypes.IndexValue getStartIndex() {
    return startIndex;
  }


  /**
   * Sets the value of the 'startIndex' field.
   * @param value the value to set.
   */
  public void setStartIndex(Energistics.Etp.v12.Datatypes.IndexValue value) {
    this.startIndex = value;
  }

  /**
   * Gets the value of the 'dataChanges' field.
   * @return The value of the 'dataChanges' field.
   */
  public boolean getDataChanges() {
    return dataChanges;
  }


  /**
   * Sets the value of the 'dataChanges' field.
   * @param value the value to set.
   */
  public void setDataChanges(boolean value) {
    this.dataChanges = value;
  }

  /**
   * Gets the value of the 'requestLatestIndexCount' field.
   * @return The value of the 'requestLatestIndexCount' field.
   */
  public java.lang.Integer getRequestLatestIndexCount() {
    return requestLatestIndexCount;
  }


  /**
   * Sets the value of the 'requestLatestIndexCount' field.
   * @param value the value to set.
   */
  public void setRequestLatestIndexCount(java.lang.Integer value) {
    this.requestLatestIndexCount = value;
  }

  /**
   * Creates a new ChannelSubscribeInfo RecordBuilder.
   * @return A new ChannelSubscribeInfo RecordBuilder
   */
  public static Energistics.Etp.v12.Datatypes.ChannelData.ChannelSubscribeInfo.Builder newBuilder() {
    return new Energistics.Etp.v12.Datatypes.ChannelData.ChannelSubscribeInfo.Builder();
  }

  /**
   * Creates a new ChannelSubscribeInfo RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new ChannelSubscribeInfo RecordBuilder
   */
  public static Energistics.Etp.v12.Datatypes.ChannelData.ChannelSubscribeInfo.Builder newBuilder(Energistics.Etp.v12.Datatypes.ChannelData.ChannelSubscribeInfo.Builder other) {
    if (other == null) {
      return new Energistics.Etp.v12.Datatypes.ChannelData.ChannelSubscribeInfo.Builder();
    } else {
      return new Energistics.Etp.v12.Datatypes.ChannelData.ChannelSubscribeInfo.Builder(other);
    }
  }

  /**
   * Creates a new ChannelSubscribeInfo RecordBuilder by copying an existing ChannelSubscribeInfo instance.
   * @param other The existing instance to copy.
   * @return A new ChannelSubscribeInfo RecordBuilder
   */
  public static Energistics.Etp.v12.Datatypes.ChannelData.ChannelSubscribeInfo.Builder newBuilder(Energistics.Etp.v12.Datatypes.ChannelData.ChannelSubscribeInfo other) {
    if (other == null) {
      return new Energistics.Etp.v12.Datatypes.ChannelData.ChannelSubscribeInfo.Builder();
    } else {
      return new Energistics.Etp.v12.Datatypes.ChannelData.ChannelSubscribeInfo.Builder(other);
    }
  }

  /**
   * RecordBuilder for ChannelSubscribeInfo instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<ChannelSubscribeInfo>
    implements org.apache.avro.data.RecordBuilder<ChannelSubscribeInfo> {

    private long channelId;
    private Energistics.Etp.v12.Datatypes.IndexValue startIndex;
    private Energistics.Etp.v12.Datatypes.IndexValue.Builder startIndexBuilder;
    private boolean dataChanges;
    private java.lang.Integer requestLatestIndexCount;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(Energistics.Etp.v12.Datatypes.ChannelData.ChannelSubscribeInfo.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.channelId)) {
        this.channelId = data().deepCopy(fields()[0].schema(), other.channelId);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.startIndex)) {
        this.startIndex = data().deepCopy(fields()[1].schema(), other.startIndex);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (other.hasStartIndexBuilder()) {
        this.startIndexBuilder = Energistics.Etp.v12.Datatypes.IndexValue.newBuilder(other.getStartIndexBuilder());
      }
      if (isValidValue(fields()[2], other.dataChanges)) {
        this.dataChanges = data().deepCopy(fields()[2].schema(), other.dataChanges);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
      if (isValidValue(fields()[3], other.requestLatestIndexCount)) {
        this.requestLatestIndexCount = data().deepCopy(fields()[3].schema(), other.requestLatestIndexCount);
        fieldSetFlags()[3] = other.fieldSetFlags()[3];
      }
    }

    /**
     * Creates a Builder by copying an existing ChannelSubscribeInfo instance
     * @param other The existing instance to copy.
     */
    private Builder(Energistics.Etp.v12.Datatypes.ChannelData.ChannelSubscribeInfo other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.channelId)) {
        this.channelId = data().deepCopy(fields()[0].schema(), other.channelId);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.startIndex)) {
        this.startIndex = data().deepCopy(fields()[1].schema(), other.startIndex);
        fieldSetFlags()[1] = true;
      }
      this.startIndexBuilder = null;
      if (isValidValue(fields()[2], other.dataChanges)) {
        this.dataChanges = data().deepCopy(fields()[2].schema(), other.dataChanges);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.requestLatestIndexCount)) {
        this.requestLatestIndexCount = data().deepCopy(fields()[3].schema(), other.requestLatestIndexCount);
        fieldSetFlags()[3] = true;
      }
    }

    /**
      * Gets the value of the 'channelId' field.
      * @return The value.
      */
    public long getChannelId() {
      return channelId;
    }


    /**
      * Sets the value of the 'channelId' field.
      * @param value The value of 'channelId'.
      * @return This builder.
      */
    public Energistics.Etp.v12.Datatypes.ChannelData.ChannelSubscribeInfo.Builder setChannelId(long value) {
      validate(fields()[0], value);
      this.channelId = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'channelId' field has been set.
      * @return True if the 'channelId' field has been set, false otherwise.
      */
    public boolean hasChannelId() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'channelId' field.
      * @return This builder.
      */
    public Energistics.Etp.v12.Datatypes.ChannelData.ChannelSubscribeInfo.Builder clearChannelId() {
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'startIndex' field.
      * @return The value.
      */
    public Energistics.Etp.v12.Datatypes.IndexValue getStartIndex() {
      return startIndex;
    }


    /**
      * Sets the value of the 'startIndex' field.
      * @param value The value of 'startIndex'.
      * @return This builder.
      */
    public Energistics.Etp.v12.Datatypes.ChannelData.ChannelSubscribeInfo.Builder setStartIndex(Energistics.Etp.v12.Datatypes.IndexValue value) {
      validate(fields()[1], value);
      this.startIndexBuilder = null;
      this.startIndex = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'startIndex' field has been set.
      * @return True if the 'startIndex' field has been set, false otherwise.
      */
    public boolean hasStartIndex() {
      return fieldSetFlags()[1];
    }

    /**
     * Gets the Builder instance for the 'startIndex' field and creates one if it doesn't exist yet.
     * @return This builder.
     */
    public Energistics.Etp.v12.Datatypes.IndexValue.Builder getStartIndexBuilder() {
      if (startIndexBuilder == null) {
        if (hasStartIndex()) {
          setStartIndexBuilder(Energistics.Etp.v12.Datatypes.IndexValue.newBuilder(startIndex));
        } else {
          setStartIndexBuilder(Energistics.Etp.v12.Datatypes.IndexValue.newBuilder());
        }
      }
      return startIndexBuilder;
    }

    /**
     * Sets the Builder instance for the 'startIndex' field
     * @param value The builder instance that must be set.
     * @return This builder.
     */

    public Energistics.Etp.v12.Datatypes.ChannelData.ChannelSubscribeInfo.Builder setStartIndexBuilder(Energistics.Etp.v12.Datatypes.IndexValue.Builder value) {
      clearStartIndex();
      startIndexBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'startIndex' field has an active Builder instance
     * @return True if the 'startIndex' field has an active Builder instance
     */
    public boolean hasStartIndexBuilder() {
      return startIndexBuilder != null;
    }

    /**
      * Clears the value of the 'startIndex' field.
      * @return This builder.
      */
    public Energistics.Etp.v12.Datatypes.ChannelData.ChannelSubscribeInfo.Builder clearStartIndex() {
      startIndex = null;
      startIndexBuilder = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'dataChanges' field.
      * @return The value.
      */
    public boolean getDataChanges() {
      return dataChanges;
    }


    /**
      * Sets the value of the 'dataChanges' field.
      * @param value The value of 'dataChanges'.
      * @return This builder.
      */
    public Energistics.Etp.v12.Datatypes.ChannelData.ChannelSubscribeInfo.Builder setDataChanges(boolean value) {
      validate(fields()[2], value);
      this.dataChanges = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'dataChanges' field has been set.
      * @return True if the 'dataChanges' field has been set, false otherwise.
      */
    public boolean hasDataChanges() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'dataChanges' field.
      * @return This builder.
      */
    public Energistics.Etp.v12.Datatypes.ChannelData.ChannelSubscribeInfo.Builder clearDataChanges() {
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'requestLatestIndexCount' field.
      * @return The value.
      */
    public java.lang.Integer getRequestLatestIndexCount() {
      return requestLatestIndexCount;
    }


    /**
      * Sets the value of the 'requestLatestIndexCount' field.
      * @param value The value of 'requestLatestIndexCount'.
      * @return This builder.
      */
    public Energistics.Etp.v12.Datatypes.ChannelData.ChannelSubscribeInfo.Builder setRequestLatestIndexCount(java.lang.Integer value) {
      validate(fields()[3], value);
      this.requestLatestIndexCount = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'requestLatestIndexCount' field has been set.
      * @return True if the 'requestLatestIndexCount' field has been set, false otherwise.
      */
    public boolean hasRequestLatestIndexCount() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'requestLatestIndexCount' field.
      * @return This builder.
      */
    public Energistics.Etp.v12.Datatypes.ChannelData.ChannelSubscribeInfo.Builder clearRequestLatestIndexCount() {
      requestLatestIndexCount = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public ChannelSubscribeInfo build() {
      try {
        ChannelSubscribeInfo record = new ChannelSubscribeInfo();
        record.channelId = fieldSetFlags()[0] ? this.channelId : (java.lang.Long) defaultValue(fields()[0]);
        if (startIndexBuilder != null) {
          try {
            record.startIndex = this.startIndexBuilder.build();
          } catch (org.apache.avro.AvroMissingFieldException e) {
            e.addParentField(record.getSchema().getField("startIndex"));
            throw e;
          }
        } else {
          record.startIndex = fieldSetFlags()[1] ? this.startIndex : (Energistics.Etp.v12.Datatypes.IndexValue) defaultValue(fields()[1]);
        }
        record.dataChanges = fieldSetFlags()[2] ? this.dataChanges : (java.lang.Boolean) defaultValue(fields()[2]);
        record.requestLatestIndexCount = fieldSetFlags()[3] ? this.requestLatestIndexCount : (java.lang.Integer) defaultValue(fields()[3]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<ChannelSubscribeInfo>
    WRITER$ = (org.apache.avro.io.DatumWriter<ChannelSubscribeInfo>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<ChannelSubscribeInfo>
    READER$ = (org.apache.avro.io.DatumReader<ChannelSubscribeInfo>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}










