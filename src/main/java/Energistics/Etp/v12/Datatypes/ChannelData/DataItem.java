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
public class DataItem extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 411542496565787445L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"DataItem\",\"namespace\":\"Energistics.Etp.v12.Datatypes.ChannelData\",\"fields\":[{\"name\":\"channelId\",\"type\":\"long\"},{\"name\":\"indexes\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"IndexValue\",\"namespace\":\"Energistics.Etp.v12.Datatypes\",\"fields\":[{\"name\":\"item\",\"type\":[\"null\",\"long\",\"double\",{\"type\":\"record\",\"name\":\"PassIndexedDepth\",\"namespace\":\"Energistics.Etp.v12.Datatypes.ChannelData\",\"fields\":[{\"name\":\"pass\",\"type\":\"long\"},{\"name\":\"direction\",\"type\":{\"type\":\"enum\",\"name\":\"PassDirection\",\"symbols\":[\"Up\",\"HoldingSteady\",\"Down\"],\"fullName\":\"Energistics.Etp.v12.Datatypes.ChannelData.PassDirection\",\"depends\":[]}},{\"name\":\"depth\",\"type\":\"double\"}],\"fullName\":\"Energistics.Etp.v12.Datatypes.ChannelData.PassIndexedDepth\",\"depends\":[\"Energistics.Etp.v12.Datatypes.ChannelData.PassDirection\"]}]}],\"fullName\":\"Energistics.Etp.v12.Datatypes.IndexValue\",\"depends\":[\"Energistics.Etp.v12.Datatypes.ChannelData.PassIndexedDepth\"]}}},{\"name\":\"value\",\"type\":{\"type\":\"record\",\"name\":\"DataValue\",\"namespace\":\"Energistics.Etp.v12.Datatypes\",\"fields\":[{\"name\":\"item\",\"type\":[\"null\",\"boolean\",\"int\",\"long\",\"float\",\"double\",\"string\",{\"type\":\"record\",\"name\":\"ArrayOfBoolean\",\"fields\":[{\"name\":\"values\",\"type\":{\"type\":\"array\",\"items\":\"boolean\"}}],\"fullName\":\"Energistics.Etp.v12.Datatypes.ArrayOfBoolean\",\"depends\":[]},{\"type\":\"record\",\"name\":\"ArrayOfNullableBoolean\",\"fields\":[{\"name\":\"values\",\"type\":{\"type\":\"array\",\"items\":[\"null\",\"boolean\"]}}],\"fullName\":\"Energistics.Etp.v12.Datatypes.ArrayOfNullableBoolean\",\"depends\":[]},{\"type\":\"record\",\"name\":\"ArrayOfInt\",\"fields\":[{\"name\":\"values\",\"type\":{\"type\":\"array\",\"items\":\"int\"}}],\"fullName\":\"Energistics.Etp.v12.Datatypes.ArrayOfInt\",\"depends\":[]},{\"type\":\"record\",\"name\":\"ArrayOfNullableInt\",\"fields\":[{\"name\":\"values\",\"type\":{\"type\":\"array\",\"items\":[\"null\",\"int\"]}}],\"fullName\":\"Energistics.Etp.v12.Datatypes.ArrayOfNullableInt\",\"depends\":[]},{\"type\":\"record\",\"name\":\"ArrayOfLong\",\"fields\":[{\"name\":\"values\",\"type\":{\"type\":\"array\",\"items\":\"long\"}}],\"fullName\":\"Energistics.Etp.v12.Datatypes.ArrayOfLong\",\"depends\":[]},{\"type\":\"record\",\"name\":\"ArrayOfNullableLong\",\"fields\":[{\"name\":\"values\",\"type\":{\"type\":\"array\",\"items\":[\"null\",\"long\"]}}],\"fullName\":\"Energistics.Etp.v12.Datatypes.ArrayOfNullableLong\",\"depends\":[]},{\"type\":\"record\",\"name\":\"ArrayOfFloat\",\"fields\":[{\"name\":\"values\",\"type\":{\"type\":\"array\",\"items\":\"float\"}}],\"fullName\":\"Energistics.Etp.v12.Datatypes.ArrayOfFloat\",\"depends\":[]},{\"type\":\"record\",\"name\":\"ArrayOfDouble\",\"fields\":[{\"name\":\"values\",\"type\":{\"type\":\"array\",\"items\":\"double\"}}],\"fullName\":\"Energistics.Etp.v12.Datatypes.ArrayOfDouble\",\"depends\":[]},{\"type\":\"record\",\"name\":\"ArrayOfString\",\"fields\":[{\"name\":\"values\",\"type\":{\"type\":\"array\",\"items\":\"string\"}}],\"fullName\":\"Energistics.Etp.v12.Datatypes.ArrayOfString\",\"depends\":[]},{\"type\":\"record\",\"name\":\"ArrayOfBytes\",\"fields\":[{\"name\":\"values\",\"type\":{\"type\":\"array\",\"items\":\"bytes\"}}],\"fullName\":\"Energistics.Etp.v12.Datatypes.ArrayOfBytes\",\"depends\":[]},\"bytes\",{\"type\":\"record\",\"name\":\"AnySparseArray\",\"fields\":[{\"name\":\"slices\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"AnySubarray\",\"fields\":[{\"name\":\"start\",\"type\":\"long\"},{\"name\":\"slice\",\"type\":{\"type\":\"record\",\"name\":\"AnyArray\",\"fields\":[{\"name\":\"item\",\"type\":[\"ArrayOfBoolean\",\"ArrayOfInt\",\"ArrayOfLong\",\"ArrayOfFloat\",\"ArrayOfDouble\",\"ArrayOfString\",\"bytes\"]}],\"fullName\":\"Energistics.Etp.v12.Datatypes.AnyArray\",\"depends\":[\"Energistics.Etp.v12.Datatypes.ArrayOfBoolean\",\"Energistics.Etp.v12.Datatypes.ArrayOfInt\",\"Energistics.Etp.v12.Datatypes.ArrayOfLong\",\"Energistics.Etp.v12.Datatypes.ArrayOfFloat\",\"Energistics.Etp.v12.Datatypes.ArrayOfDouble\",\"Energistics.Etp.v12.Datatypes.ArrayOfString\"]}}],\"fullName\":\"Energistics.Etp.v12.Datatypes.AnySubarray\",\"depends\":[\"Energistics.Etp.v12.Datatypes.AnyArray\"]}}}],\"fullName\":\"Energistics.Etp.v12.Datatypes.AnySparseArray\",\"depends\":[\"Energistics.Etp.v12.Datatypes.AnySubarray\"]}]}],\"fullName\":\"Energistics.Etp.v12.Datatypes.DataValue\",\"depends\":[\"Energistics.Etp.v12.Datatypes.ArrayOfBoolean\",\"Energistics.Etp.v12.Datatypes.ArrayOfNullableBoolean\",\"Energistics.Etp.v12.Datatypes.ArrayOfInt\",\"Energistics.Etp.v12.Datatypes.ArrayOfNullableInt\",\"Energistics.Etp.v12.Datatypes.ArrayOfLong\",\"Energistics.Etp.v12.Datatypes.ArrayOfNullableLong\",\"Energistics.Etp.v12.Datatypes.ArrayOfFloat\",\"Energistics.Etp.v12.Datatypes.ArrayOfDouble\",\"Energistics.Etp.v12.Datatypes.ArrayOfString\",\"Energistics.Etp.v12.Datatypes.ArrayOfBytes\",\"Energistics.Etp.v12.Datatypes.AnySparseArray\"]}},{\"name\":\"valueAttributes\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"DataAttribute\",\"namespace\":\"Energistics.Etp.v12.Datatypes\",\"fields\":[{\"name\":\"attributeId\",\"type\":\"int\"},{\"name\":\"attributeValue\",\"type\":\"DataValue\"}],\"fullName\":\"Energistics.Etp.v12.Datatypes.DataAttribute\",\"depends\":[\"Energistics.Etp.v12.Datatypes.DataValue\"]}},\"default\":[]}],\"fullName\":\"Energistics.Etp.v12.Datatypes.ChannelData.DataItem\",\"depends\":[\"Energistics.Etp.v12.Datatypes.IndexValue\",\"Energistics.Etp.v12.Datatypes.DataValue\",\"Energistics.Etp.v12.Datatypes.DataAttribute\"]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<DataItem> ENCODER =
      new BinaryMessageEncoder<DataItem>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<DataItem> DECODER =
      new BinaryMessageDecoder<DataItem>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<DataItem> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<DataItem> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<DataItem> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<DataItem>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this DataItem to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a DataItem from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a DataItem instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static DataItem fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

   private long channelId;
   private java.util.List<Energistics.Etp.v12.Datatypes.IndexValue> indexes;
   private Energistics.Etp.v12.Datatypes.DataValue value;
   private java.util.List<Energistics.Etp.v12.Datatypes.DataAttribute> valueAttributes;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public DataItem() {}

  /**
   * All-args constructor.
   * @param channelId The new value for channelId
   * @param indexes The new value for indexes
   * @param value The new value for value
   * @param valueAttributes The new value for valueAttributes
   */
  public DataItem(java.lang.Long channelId, java.util.List<Energistics.Etp.v12.Datatypes.IndexValue> indexes, Energistics.Etp.v12.Datatypes.DataValue value, java.util.List<Energistics.Etp.v12.Datatypes.DataAttribute> valueAttributes) {
    this.channelId = channelId;
    this.indexes = indexes;
    this.value = value;
    this.valueAttributes = valueAttributes;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return channelId;
    case 1: return indexes;
    case 2: return value;
    case 3: return valueAttributes;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: channelId = (java.lang.Long)value$; break;
    case 1: indexes = (java.util.List<Energistics.Etp.v12.Datatypes.IndexValue>)value$; break;
    case 2: value = (Energistics.Etp.v12.Datatypes.DataValue)value$; break;
    case 3: valueAttributes = (java.util.List<Energistics.Etp.v12.Datatypes.DataAttribute>)value$; break;
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
   * Gets the value of the 'indexes' field.
   * @return The value of the 'indexes' field.
   */
  public java.util.List<Energistics.Etp.v12.Datatypes.IndexValue> getIndexes() {
    return indexes;
  }


  /**
   * Sets the value of the 'indexes' field.
   * @param value the value to set.
   */
  public void setIndexes(java.util.List<Energistics.Etp.v12.Datatypes.IndexValue> value) {
    this.indexes = value;
  }

  /**
   * Gets the value of the 'value' field.
   * @return The value of the 'value' field.
   */
  public Energistics.Etp.v12.Datatypes.DataValue getValue() {
    return value;
  }


  /**
   * Sets the value of the 'value' field.
   * @param value the value to set.
   */
  public void setValue(Energistics.Etp.v12.Datatypes.DataValue value) {
    this.value = value;
  }

  /**
   * Gets the value of the 'valueAttributes' field.
   * @return The value of the 'valueAttributes' field.
   */
  public java.util.List<Energistics.Etp.v12.Datatypes.DataAttribute> getValueAttributes() {
    return valueAttributes;
  }


  /**
   * Sets the value of the 'valueAttributes' field.
   * @param value the value to set.
   */
  public void setValueAttributes(java.util.List<Energistics.Etp.v12.Datatypes.DataAttribute> value) {
    this.valueAttributes = value;
  }

  /**
   * Creates a new DataItem RecordBuilder.
   * @return A new DataItem RecordBuilder
   */
  public static Energistics.Etp.v12.Datatypes.ChannelData.DataItem.Builder newBuilder() {
    return new Energistics.Etp.v12.Datatypes.ChannelData.DataItem.Builder();
  }

  /**
   * Creates a new DataItem RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new DataItem RecordBuilder
   */
  public static Energistics.Etp.v12.Datatypes.ChannelData.DataItem.Builder newBuilder(Energistics.Etp.v12.Datatypes.ChannelData.DataItem.Builder other) {
    if (other == null) {
      return new Energistics.Etp.v12.Datatypes.ChannelData.DataItem.Builder();
    } else {
      return new Energistics.Etp.v12.Datatypes.ChannelData.DataItem.Builder(other);
    }
  }

  /**
   * Creates a new DataItem RecordBuilder by copying an existing DataItem instance.
   * @param other The existing instance to copy.
   * @return A new DataItem RecordBuilder
   */
  public static Energistics.Etp.v12.Datatypes.ChannelData.DataItem.Builder newBuilder(Energistics.Etp.v12.Datatypes.ChannelData.DataItem other) {
    if (other == null) {
      return new Energistics.Etp.v12.Datatypes.ChannelData.DataItem.Builder();
    } else {
      return new Energistics.Etp.v12.Datatypes.ChannelData.DataItem.Builder(other);
    }
  }

  /**
   * RecordBuilder for DataItem instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<DataItem>
    implements org.apache.avro.data.RecordBuilder<DataItem> {

    private long channelId;
    private java.util.List<Energistics.Etp.v12.Datatypes.IndexValue> indexes;
    private Energistics.Etp.v12.Datatypes.DataValue value;
    private Energistics.Etp.v12.Datatypes.DataValue.Builder valueBuilder;
    private java.util.List<Energistics.Etp.v12.Datatypes.DataAttribute> valueAttributes;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(Energistics.Etp.v12.Datatypes.ChannelData.DataItem.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.channelId)) {
        this.channelId = data().deepCopy(fields()[0].schema(), other.channelId);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.indexes)) {
        this.indexes = data().deepCopy(fields()[1].schema(), other.indexes);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.value)) {
        this.value = data().deepCopy(fields()[2].schema(), other.value);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
      if (other.hasValueBuilder()) {
        this.valueBuilder = Energistics.Etp.v12.Datatypes.DataValue.newBuilder(other.getValueBuilder());
      }
      if (isValidValue(fields()[3], other.valueAttributes)) {
        this.valueAttributes = data().deepCopy(fields()[3].schema(), other.valueAttributes);
        fieldSetFlags()[3] = other.fieldSetFlags()[3];
      }
    }

    /**
     * Creates a Builder by copying an existing DataItem instance
     * @param other The existing instance to copy.
     */
    private Builder(Energistics.Etp.v12.Datatypes.ChannelData.DataItem other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.channelId)) {
        this.channelId = data().deepCopy(fields()[0].schema(), other.channelId);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.indexes)) {
        this.indexes = data().deepCopy(fields()[1].schema(), other.indexes);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.value)) {
        this.value = data().deepCopy(fields()[2].schema(), other.value);
        fieldSetFlags()[2] = true;
      }
      this.valueBuilder = null;
      if (isValidValue(fields()[3], other.valueAttributes)) {
        this.valueAttributes = data().deepCopy(fields()[3].schema(), other.valueAttributes);
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
    public Energistics.Etp.v12.Datatypes.ChannelData.DataItem.Builder setChannelId(long value) {
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
    public Energistics.Etp.v12.Datatypes.ChannelData.DataItem.Builder clearChannelId() {
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'indexes' field.
      * @return The value.
      */
    public java.util.List<Energistics.Etp.v12.Datatypes.IndexValue> getIndexes() {
      return indexes;
    }


    /**
      * Sets the value of the 'indexes' field.
      * @param value The value of 'indexes'.
      * @return This builder.
      */
    public Energistics.Etp.v12.Datatypes.ChannelData.DataItem.Builder setIndexes(java.util.List<Energistics.Etp.v12.Datatypes.IndexValue> value) {
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
    public Energistics.Etp.v12.Datatypes.ChannelData.DataItem.Builder clearIndexes() {
      indexes = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'value' field.
      * @return The value.
      */
    public Energistics.Etp.v12.Datatypes.DataValue getValue() {
      return value;
    }


    /**
      * Sets the value of the 'value' field.
      * @param value The value of 'value'.
      * @return This builder.
      */
    public Energistics.Etp.v12.Datatypes.ChannelData.DataItem.Builder setValue(Energistics.Etp.v12.Datatypes.DataValue value) {
      validate(fields()[2], value);
      this.valueBuilder = null;
      this.value = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'value' field has been set.
      * @return True if the 'value' field has been set, false otherwise.
      */
    public boolean hasValue() {
      return fieldSetFlags()[2];
    }

    /**
     * Gets the Builder instance for the 'value' field and creates one if it doesn't exist yet.
     * @return This builder.
     */
    public Energistics.Etp.v12.Datatypes.DataValue.Builder getValueBuilder() {
      if (valueBuilder == null) {
        if (hasValue()) {
          setValueBuilder(Energistics.Etp.v12.Datatypes.DataValue.newBuilder(value));
        } else {
          setValueBuilder(Energistics.Etp.v12.Datatypes.DataValue.newBuilder());
        }
      }
      return valueBuilder;
    }

    /**
     * Sets the Builder instance for the 'value' field
     * @param value The builder instance that must be set.
     * @return This builder.
     */

    public Energistics.Etp.v12.Datatypes.ChannelData.DataItem.Builder setValueBuilder(Energistics.Etp.v12.Datatypes.DataValue.Builder value) {
      clearValue();
      valueBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'value' field has an active Builder instance
     * @return True if the 'value' field has an active Builder instance
     */
    public boolean hasValueBuilder() {
      return valueBuilder != null;
    }

    /**
      * Clears the value of the 'value' field.
      * @return This builder.
      */
    public Energistics.Etp.v12.Datatypes.ChannelData.DataItem.Builder clearValue() {
      value = null;
      valueBuilder = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'valueAttributes' field.
      * @return The value.
      */
    public java.util.List<Energistics.Etp.v12.Datatypes.DataAttribute> getValueAttributes() {
      return valueAttributes;
    }


    /**
      * Sets the value of the 'valueAttributes' field.
      * @param value The value of 'valueAttributes'.
      * @return This builder.
      */
    public Energistics.Etp.v12.Datatypes.ChannelData.DataItem.Builder setValueAttributes(java.util.List<Energistics.Etp.v12.Datatypes.DataAttribute> value) {
      validate(fields()[3], value);
      this.valueAttributes = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'valueAttributes' field has been set.
      * @return True if the 'valueAttributes' field has been set, false otherwise.
      */
    public boolean hasValueAttributes() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'valueAttributes' field.
      * @return This builder.
      */
    public Energistics.Etp.v12.Datatypes.ChannelData.DataItem.Builder clearValueAttributes() {
      valueAttributes = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public DataItem build() {
      try {
        DataItem record = new DataItem();
        record.channelId = fieldSetFlags()[0] ? this.channelId : (java.lang.Long) defaultValue(fields()[0]);
        record.indexes = fieldSetFlags()[1] ? this.indexes : (java.util.List<Energistics.Etp.v12.Datatypes.IndexValue>) defaultValue(fields()[1]);
        if (valueBuilder != null) {
          try {
            record.value = this.valueBuilder.build();
          } catch (org.apache.avro.AvroMissingFieldException e) {
            e.addParentField(record.getSchema().getField("value"));
            throw e;
          }
        } else {
          record.value = fieldSetFlags()[2] ? this.value : (Energistics.Etp.v12.Datatypes.DataValue) defaultValue(fields()[2]);
        }
        record.valueAttributes = fieldSetFlags()[3] ? this.valueAttributes : (java.util.List<Energistics.Etp.v12.Datatypes.DataAttribute>) defaultValue(fields()[3]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<DataItem>
    WRITER$ = (org.apache.avro.io.DatumWriter<DataItem>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<DataItem>
    READER$ = (org.apache.avro.io.DatumReader<DataItem>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}









