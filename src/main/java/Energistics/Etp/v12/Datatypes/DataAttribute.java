/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package Energistics.Etp.v12.Datatypes;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class DataAttribute extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -7689062375995744290L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"DataAttribute\",\"namespace\":\"Energistics.Etp.v12.Datatypes\",\"fields\":[{\"name\":\"attributeId\",\"type\":\"int\"},{\"name\":\"attributeValue\",\"type\":{\"type\":\"record\",\"name\":\"DataValue\",\"fields\":[{\"name\":\"item\",\"type\":[\"null\",\"boolean\",\"int\",\"long\",\"float\",\"double\",\"string\",{\"type\":\"record\",\"name\":\"ArrayOfBoolean\",\"fields\":[{\"name\":\"values\",\"type\":{\"type\":\"array\",\"items\":\"boolean\"}}],\"fullName\":\"Energistics.Etp.v12.Datatypes.ArrayOfBoolean\",\"depends\":[]},{\"type\":\"record\",\"name\":\"ArrayOfNullableBoolean\",\"fields\":[{\"name\":\"values\",\"type\":{\"type\":\"array\",\"items\":[\"null\",\"boolean\"]}}],\"fullName\":\"Energistics.Etp.v12.Datatypes.ArrayOfNullableBoolean\",\"depends\":[]},{\"type\":\"record\",\"name\":\"ArrayOfInt\",\"fields\":[{\"name\":\"values\",\"type\":{\"type\":\"array\",\"items\":\"int\"}}],\"fullName\":\"Energistics.Etp.v12.Datatypes.ArrayOfInt\",\"depends\":[]},{\"type\":\"record\",\"name\":\"ArrayOfNullableInt\",\"fields\":[{\"name\":\"values\",\"type\":{\"type\":\"array\",\"items\":[\"null\",\"int\"]}}],\"fullName\":\"Energistics.Etp.v12.Datatypes.ArrayOfNullableInt\",\"depends\":[]},{\"type\":\"record\",\"name\":\"ArrayOfLong\",\"fields\":[{\"name\":\"values\",\"type\":{\"type\":\"array\",\"items\":\"long\"}}],\"fullName\":\"Energistics.Etp.v12.Datatypes.ArrayOfLong\",\"depends\":[]},{\"type\":\"record\",\"name\":\"ArrayOfNullableLong\",\"fields\":[{\"name\":\"values\",\"type\":{\"type\":\"array\",\"items\":[\"null\",\"long\"]}}],\"fullName\":\"Energistics.Etp.v12.Datatypes.ArrayOfNullableLong\",\"depends\":[]},{\"type\":\"record\",\"name\":\"ArrayOfFloat\",\"fields\":[{\"name\":\"values\",\"type\":{\"type\":\"array\",\"items\":\"float\"}}],\"fullName\":\"Energistics.Etp.v12.Datatypes.ArrayOfFloat\",\"depends\":[]},{\"type\":\"record\",\"name\":\"ArrayOfDouble\",\"fields\":[{\"name\":\"values\",\"type\":{\"type\":\"array\",\"items\":\"double\"}}],\"fullName\":\"Energistics.Etp.v12.Datatypes.ArrayOfDouble\",\"depends\":[]},{\"type\":\"record\",\"name\":\"ArrayOfString\",\"fields\":[{\"name\":\"values\",\"type\":{\"type\":\"array\",\"items\":\"string\"}}],\"fullName\":\"Energistics.Etp.v12.Datatypes.ArrayOfString\",\"depends\":[]},{\"type\":\"record\",\"name\":\"ArrayOfBytes\",\"fields\":[{\"name\":\"values\",\"type\":{\"type\":\"array\",\"items\":\"bytes\"}}],\"fullName\":\"Energistics.Etp.v12.Datatypes.ArrayOfBytes\",\"depends\":[]},\"bytes\",{\"type\":\"record\",\"name\":\"AnySparseArray\",\"fields\":[{\"name\":\"slices\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"AnySubarray\",\"fields\":[{\"name\":\"start\",\"type\":\"long\"},{\"name\":\"slice\",\"type\":{\"type\":\"record\",\"name\":\"AnyArray\",\"fields\":[{\"name\":\"item\",\"type\":[\"ArrayOfBoolean\",\"ArrayOfInt\",\"ArrayOfLong\",\"ArrayOfFloat\",\"ArrayOfDouble\",\"ArrayOfString\",\"bytes\"]}],\"fullName\":\"Energistics.Etp.v12.Datatypes.AnyArray\",\"depends\":[\"Energistics.Etp.v12.Datatypes.ArrayOfBoolean\",\"Energistics.Etp.v12.Datatypes.ArrayOfInt\",\"Energistics.Etp.v12.Datatypes.ArrayOfLong\",\"Energistics.Etp.v12.Datatypes.ArrayOfFloat\",\"Energistics.Etp.v12.Datatypes.ArrayOfDouble\",\"Energistics.Etp.v12.Datatypes.ArrayOfString\"]}}],\"fullName\":\"Energistics.Etp.v12.Datatypes.AnySubarray\",\"depends\":[\"Energistics.Etp.v12.Datatypes.AnyArray\"]}}}],\"fullName\":\"Energistics.Etp.v12.Datatypes.AnySparseArray\",\"depends\":[\"Energistics.Etp.v12.Datatypes.AnySubarray\"]}]}],\"fullName\":\"Energistics.Etp.v12.Datatypes.DataValue\",\"depends\":[\"Energistics.Etp.v12.Datatypes.ArrayOfBoolean\",\"Energistics.Etp.v12.Datatypes.ArrayOfNullableBoolean\",\"Energistics.Etp.v12.Datatypes.ArrayOfInt\",\"Energistics.Etp.v12.Datatypes.ArrayOfNullableInt\",\"Energistics.Etp.v12.Datatypes.ArrayOfLong\",\"Energistics.Etp.v12.Datatypes.ArrayOfNullableLong\",\"Energistics.Etp.v12.Datatypes.ArrayOfFloat\",\"Energistics.Etp.v12.Datatypes.ArrayOfDouble\",\"Energistics.Etp.v12.Datatypes.ArrayOfString\",\"Energistics.Etp.v12.Datatypes.ArrayOfBytes\",\"Energistics.Etp.v12.Datatypes.AnySparseArray\"]}}],\"fullName\":\"Energistics.Etp.v12.Datatypes.DataAttribute\",\"depends\":[\"Energistics.Etp.v12.Datatypes.DataValue\"]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<DataAttribute> ENCODER =
      new BinaryMessageEncoder<DataAttribute>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<DataAttribute> DECODER =
      new BinaryMessageDecoder<DataAttribute>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<DataAttribute> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<DataAttribute> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<DataAttribute> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<DataAttribute>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this DataAttribute to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a DataAttribute from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a DataAttribute instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static DataAttribute fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

   private int attributeId;
   private Energistics.Etp.v12.Datatypes.DataValue attributeValue;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public DataAttribute() {}

  /**
   * All-args constructor.
   * @param attributeId The new value for attributeId
   * @param attributeValue The new value for attributeValue
   */
  public DataAttribute(java.lang.Integer attributeId, Energistics.Etp.v12.Datatypes.DataValue attributeValue) {
    this.attributeId = attributeId;
    this.attributeValue = attributeValue;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return attributeId;
    case 1: return attributeValue;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: attributeId = (java.lang.Integer)value$; break;
    case 1: attributeValue = (Energistics.Etp.v12.Datatypes.DataValue)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'attributeId' field.
   * @return The value of the 'attributeId' field.
   */
  public int getAttributeId() {
    return attributeId;
  }


  /**
   * Sets the value of the 'attributeId' field.
   * @param value the value to set.
   */
  public void setAttributeId(int value) {
    this.attributeId = value;
  }

  /**
   * Gets the value of the 'attributeValue' field.
   * @return The value of the 'attributeValue' field.
   */
  public Energistics.Etp.v12.Datatypes.DataValue getAttributeValue() {
    return attributeValue;
  }


  /**
   * Sets the value of the 'attributeValue' field.
   * @param value the value to set.
   */
  public void setAttributeValue(Energistics.Etp.v12.Datatypes.DataValue value) {
    this.attributeValue = value;
  }

  /**
   * Creates a new DataAttribute RecordBuilder.
   * @return A new DataAttribute RecordBuilder
   */
  public static Energistics.Etp.v12.Datatypes.DataAttribute.Builder newBuilder() {
    return new Energistics.Etp.v12.Datatypes.DataAttribute.Builder();
  }

  /**
   * Creates a new DataAttribute RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new DataAttribute RecordBuilder
   */
  public static Energistics.Etp.v12.Datatypes.DataAttribute.Builder newBuilder(Energistics.Etp.v12.Datatypes.DataAttribute.Builder other) {
    if (other == null) {
      return new Energistics.Etp.v12.Datatypes.DataAttribute.Builder();
    } else {
      return new Energistics.Etp.v12.Datatypes.DataAttribute.Builder(other);
    }
  }

  /**
   * Creates a new DataAttribute RecordBuilder by copying an existing DataAttribute instance.
   * @param other The existing instance to copy.
   * @return A new DataAttribute RecordBuilder
   */
  public static Energistics.Etp.v12.Datatypes.DataAttribute.Builder newBuilder(Energistics.Etp.v12.Datatypes.DataAttribute other) {
    if (other == null) {
      return new Energistics.Etp.v12.Datatypes.DataAttribute.Builder();
    } else {
      return new Energistics.Etp.v12.Datatypes.DataAttribute.Builder(other);
    }
  }

  /**
   * RecordBuilder for DataAttribute instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<DataAttribute>
    implements org.apache.avro.data.RecordBuilder<DataAttribute> {

    private int attributeId;
    private Energistics.Etp.v12.Datatypes.DataValue attributeValue;
    private Energistics.Etp.v12.Datatypes.DataValue.Builder attributeValueBuilder;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(Energistics.Etp.v12.Datatypes.DataAttribute.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.attributeId)) {
        this.attributeId = data().deepCopy(fields()[0].schema(), other.attributeId);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.attributeValue)) {
        this.attributeValue = data().deepCopy(fields()[1].schema(), other.attributeValue);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (other.hasAttributeValueBuilder()) {
        this.attributeValueBuilder = Energistics.Etp.v12.Datatypes.DataValue.newBuilder(other.getAttributeValueBuilder());
      }
    }

    /**
     * Creates a Builder by copying an existing DataAttribute instance
     * @param other The existing instance to copy.
     */
    private Builder(Energistics.Etp.v12.Datatypes.DataAttribute other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.attributeId)) {
        this.attributeId = data().deepCopy(fields()[0].schema(), other.attributeId);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.attributeValue)) {
        this.attributeValue = data().deepCopy(fields()[1].schema(), other.attributeValue);
        fieldSetFlags()[1] = true;
      }
      this.attributeValueBuilder = null;
    }

    /**
      * Gets the value of the 'attributeId' field.
      * @return The value.
      */
    public int getAttributeId() {
      return attributeId;
    }


    /**
      * Sets the value of the 'attributeId' field.
      * @param value The value of 'attributeId'.
      * @return This builder.
      */
    public Energistics.Etp.v12.Datatypes.DataAttribute.Builder setAttributeId(int value) {
      validate(fields()[0], value);
      this.attributeId = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'attributeId' field has been set.
      * @return True if the 'attributeId' field has been set, false otherwise.
      */
    public boolean hasAttributeId() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'attributeId' field.
      * @return This builder.
      */
    public Energistics.Etp.v12.Datatypes.DataAttribute.Builder clearAttributeId() {
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'attributeValue' field.
      * @return The value.
      */
    public Energistics.Etp.v12.Datatypes.DataValue getAttributeValue() {
      return attributeValue;
    }


    /**
      * Sets the value of the 'attributeValue' field.
      * @param value The value of 'attributeValue'.
      * @return This builder.
      */
    public Energistics.Etp.v12.Datatypes.DataAttribute.Builder setAttributeValue(Energistics.Etp.v12.Datatypes.DataValue value) {
      validate(fields()[1], value);
      this.attributeValueBuilder = null;
      this.attributeValue = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'attributeValue' field has been set.
      * @return True if the 'attributeValue' field has been set, false otherwise.
      */
    public boolean hasAttributeValue() {
      return fieldSetFlags()[1];
    }

    /**
     * Gets the Builder instance for the 'attributeValue' field and creates one if it doesn't exist yet.
     * @return This builder.
     */
    public Energistics.Etp.v12.Datatypes.DataValue.Builder getAttributeValueBuilder() {
      if (attributeValueBuilder == null) {
        if (hasAttributeValue()) {
          setAttributeValueBuilder(Energistics.Etp.v12.Datatypes.DataValue.newBuilder(attributeValue));
        } else {
          setAttributeValueBuilder(Energistics.Etp.v12.Datatypes.DataValue.newBuilder());
        }
      }
      return attributeValueBuilder;
    }

    /**
     * Sets the Builder instance for the 'attributeValue' field
     * @param value The builder instance that must be set.
     * @return This builder.
     */

    public Energistics.Etp.v12.Datatypes.DataAttribute.Builder setAttributeValueBuilder(Energistics.Etp.v12.Datatypes.DataValue.Builder value) {
      clearAttributeValue();
      attributeValueBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'attributeValue' field has an active Builder instance
     * @return True if the 'attributeValue' field has an active Builder instance
     */
    public boolean hasAttributeValueBuilder() {
      return attributeValueBuilder != null;
    }

    /**
      * Clears the value of the 'attributeValue' field.
      * @return This builder.
      */
    public Energistics.Etp.v12.Datatypes.DataAttribute.Builder clearAttributeValue() {
      attributeValue = null;
      attributeValueBuilder = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public DataAttribute build() {
      try {
        DataAttribute record = new DataAttribute();
        record.attributeId = fieldSetFlags()[0] ? this.attributeId : (java.lang.Integer) defaultValue(fields()[0]);
        if (attributeValueBuilder != null) {
          try {
            record.attributeValue = this.attributeValueBuilder.build();
          } catch (org.apache.avro.AvroMissingFieldException e) {
            e.addParentField(record.getSchema().getField("attributeValue"));
            throw e;
          }
        } else {
          record.attributeValue = fieldSetFlags()[1] ? this.attributeValue : (Energistics.Etp.v12.Datatypes.DataValue) defaultValue(fields()[1]);
        }
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<DataAttribute>
    WRITER$ = (org.apache.avro.io.DatumWriter<DataAttribute>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<DataAttribute>
    READER$ = (org.apache.avro.io.DatumReader<DataAttribute>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}










