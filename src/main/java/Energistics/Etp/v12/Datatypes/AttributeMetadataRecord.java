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
public class AttributeMetadataRecord extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -2966541037525713730L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"AttributeMetadataRecord\",\"namespace\":\"Energistics.Etp.v12.Datatypes\",\"fields\":[{\"name\":\"attributeId\",\"type\":\"int\"},{\"name\":\"attributeName\",\"type\":\"string\"},{\"name\":\"dataKind\",\"type\":{\"type\":\"enum\",\"name\":\"ChannelDataKind\",\"namespace\":\"Energistics.Etp.v12.Datatypes.ChannelData\",\"symbols\":[\"DateTime\",\"ElapsedTime\",\"MeasuredDepth\",\"PassIndexedDepth\",\"TrueVerticalDepth\",\"typeBoolean\",\"typeInt\",\"typeLong\",\"typeFloat\",\"typeDouble\",\"typeString\",\"typeBytes\"],\"fullName\":\"Energistics.Etp.v12.Datatypes.ChannelData.ChannelDataKind\",\"depends\":[]}},{\"name\":\"uom\",\"type\":\"string\"},{\"name\":\"depthDatum\",\"type\":\"string\"},{\"name\":\"attributePropertyKindUri\",\"type\":\"string\"},{\"name\":\"axisVectorLengths\",\"type\":{\"type\":\"array\",\"items\":\"int\"}}],\"fullName\":\"Energistics.Etp.v12.Datatypes.AttributeMetadataRecord\",\"depends\":[\"Energistics.Etp.v12.Datatypes.ChannelData.ChannelDataKind\"]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<AttributeMetadataRecord> ENCODER =
      new BinaryMessageEncoder<AttributeMetadataRecord>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<AttributeMetadataRecord> DECODER =
      new BinaryMessageDecoder<AttributeMetadataRecord>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<AttributeMetadataRecord> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<AttributeMetadataRecord> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<AttributeMetadataRecord> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<AttributeMetadataRecord>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this AttributeMetadataRecord to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a AttributeMetadataRecord from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a AttributeMetadataRecord instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static AttributeMetadataRecord fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

   private int attributeId;
   private java.lang.CharSequence attributeName;
   private Energistics.Etp.v12.Datatypes.ChannelData.ChannelDataKind dataKind;
   private java.lang.CharSequence uom;
   private java.lang.CharSequence depthDatum;
   private java.lang.CharSequence attributePropertyKindUri;
   private java.util.List<java.lang.Integer> axisVectorLengths;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public AttributeMetadataRecord() {}

  /**
   * All-args constructor.
   * @param attributeId The new value for attributeId
   * @param attributeName The new value for attributeName
   * @param dataKind The new value for dataKind
   * @param uom The new value for uom
   * @param depthDatum The new value for depthDatum
   * @param attributePropertyKindUri The new value for attributePropertyKindUri
   * @param axisVectorLengths The new value for axisVectorLengths
   */
  public AttributeMetadataRecord(java.lang.Integer attributeId, java.lang.CharSequence attributeName, Energistics.Etp.v12.Datatypes.ChannelData.ChannelDataKind dataKind, java.lang.CharSequence uom, java.lang.CharSequence depthDatum, java.lang.CharSequence attributePropertyKindUri, java.util.List<java.lang.Integer> axisVectorLengths) {
    this.attributeId = attributeId;
    this.attributeName = attributeName;
    this.dataKind = dataKind;
    this.uom = uom;
    this.depthDatum = depthDatum;
    this.attributePropertyKindUri = attributePropertyKindUri;
    this.axisVectorLengths = axisVectorLengths;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return attributeId;
    case 1: return attributeName;
    case 2: return dataKind;
    case 3: return uom;
    case 4: return depthDatum;
    case 5: return attributePropertyKindUri;
    case 6: return axisVectorLengths;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: attributeId = (java.lang.Integer)value$; break;
    case 1: attributeName = (java.lang.CharSequence)value$; break;
    case 2: dataKind = (Energistics.Etp.v12.Datatypes.ChannelData.ChannelDataKind)value$; break;
    case 3: uom = (java.lang.CharSequence)value$; break;
    case 4: depthDatum = (java.lang.CharSequence)value$; break;
    case 5: attributePropertyKindUri = (java.lang.CharSequence)value$; break;
    case 6: axisVectorLengths = (java.util.List<java.lang.Integer>)value$; break;
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
   * Gets the value of the 'attributeName' field.
   * @return The value of the 'attributeName' field.
   */
  public java.lang.CharSequence getAttributeName() {
    return attributeName;
  }


  /**
   * Sets the value of the 'attributeName' field.
   * @param value the value to set.
   */
  public void setAttributeName(java.lang.CharSequence value) {
    this.attributeName = value;
  }

  /**
   * Gets the value of the 'dataKind' field.
   * @return The value of the 'dataKind' field.
   */
  public Energistics.Etp.v12.Datatypes.ChannelData.ChannelDataKind getDataKind() {
    return dataKind;
  }


  /**
   * Sets the value of the 'dataKind' field.
   * @param value the value to set.
   */
  public void setDataKind(Energistics.Etp.v12.Datatypes.ChannelData.ChannelDataKind value) {
    this.dataKind = value;
  }

  /**
   * Gets the value of the 'uom' field.
   * @return The value of the 'uom' field.
   */
  public java.lang.CharSequence getUom() {
    return uom;
  }


  /**
   * Sets the value of the 'uom' field.
   * @param value the value to set.
   */
  public void setUom(java.lang.CharSequence value) {
    this.uom = value;
  }

  /**
   * Gets the value of the 'depthDatum' field.
   * @return The value of the 'depthDatum' field.
   */
  public java.lang.CharSequence getDepthDatum() {
    return depthDatum;
  }


  /**
   * Sets the value of the 'depthDatum' field.
   * @param value the value to set.
   */
  public void setDepthDatum(java.lang.CharSequence value) {
    this.depthDatum = value;
  }

  /**
   * Gets the value of the 'attributePropertyKindUri' field.
   * @return The value of the 'attributePropertyKindUri' field.
   */
  public java.lang.CharSequence getAttributePropertyKindUri() {
    return attributePropertyKindUri;
  }


  /**
   * Sets the value of the 'attributePropertyKindUri' field.
   * @param value the value to set.
   */
  public void setAttributePropertyKindUri(java.lang.CharSequence value) {
    this.attributePropertyKindUri = value;
  }

  /**
   * Gets the value of the 'axisVectorLengths' field.
   * @return The value of the 'axisVectorLengths' field.
   */
  public java.util.List<java.lang.Integer> getAxisVectorLengths() {
    return axisVectorLengths;
  }


  /**
   * Sets the value of the 'axisVectorLengths' field.
   * @param value the value to set.
   */
  public void setAxisVectorLengths(java.util.List<java.lang.Integer> value) {
    this.axisVectorLengths = value;
  }

  /**
   * Creates a new AttributeMetadataRecord RecordBuilder.
   * @return A new AttributeMetadataRecord RecordBuilder
   */
  public static Energistics.Etp.v12.Datatypes.AttributeMetadataRecord.Builder newBuilder() {
    return new Energistics.Etp.v12.Datatypes.AttributeMetadataRecord.Builder();
  }

  /**
   * Creates a new AttributeMetadataRecord RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new AttributeMetadataRecord RecordBuilder
   */
  public static Energistics.Etp.v12.Datatypes.AttributeMetadataRecord.Builder newBuilder(Energistics.Etp.v12.Datatypes.AttributeMetadataRecord.Builder other) {
    if (other == null) {
      return new Energistics.Etp.v12.Datatypes.AttributeMetadataRecord.Builder();
    } else {
      return new Energistics.Etp.v12.Datatypes.AttributeMetadataRecord.Builder(other);
    }
  }

  /**
   * Creates a new AttributeMetadataRecord RecordBuilder by copying an existing AttributeMetadataRecord instance.
   * @param other The existing instance to copy.
   * @return A new AttributeMetadataRecord RecordBuilder
   */
  public static Energistics.Etp.v12.Datatypes.AttributeMetadataRecord.Builder newBuilder(Energistics.Etp.v12.Datatypes.AttributeMetadataRecord other) {
    if (other == null) {
      return new Energistics.Etp.v12.Datatypes.AttributeMetadataRecord.Builder();
    } else {
      return new Energistics.Etp.v12.Datatypes.AttributeMetadataRecord.Builder(other);
    }
  }

  /**
   * RecordBuilder for AttributeMetadataRecord instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<AttributeMetadataRecord>
    implements org.apache.avro.data.RecordBuilder<AttributeMetadataRecord> {

    private int attributeId;
    private java.lang.CharSequence attributeName;
    private Energistics.Etp.v12.Datatypes.ChannelData.ChannelDataKind dataKind;
    private java.lang.CharSequence uom;
    private java.lang.CharSequence depthDatum;
    private java.lang.CharSequence attributePropertyKindUri;
    private java.util.List<java.lang.Integer> axisVectorLengths;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(Energistics.Etp.v12.Datatypes.AttributeMetadataRecord.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.attributeId)) {
        this.attributeId = data().deepCopy(fields()[0].schema(), other.attributeId);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.attributeName)) {
        this.attributeName = data().deepCopy(fields()[1].schema(), other.attributeName);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.dataKind)) {
        this.dataKind = data().deepCopy(fields()[2].schema(), other.dataKind);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
      if (isValidValue(fields()[3], other.uom)) {
        this.uom = data().deepCopy(fields()[3].schema(), other.uom);
        fieldSetFlags()[3] = other.fieldSetFlags()[3];
      }
      if (isValidValue(fields()[4], other.depthDatum)) {
        this.depthDatum = data().deepCopy(fields()[4].schema(), other.depthDatum);
        fieldSetFlags()[4] = other.fieldSetFlags()[4];
      }
      if (isValidValue(fields()[5], other.attributePropertyKindUri)) {
        this.attributePropertyKindUri = data().deepCopy(fields()[5].schema(), other.attributePropertyKindUri);
        fieldSetFlags()[5] = other.fieldSetFlags()[5];
      }
      if (isValidValue(fields()[6], other.axisVectorLengths)) {
        this.axisVectorLengths = data().deepCopy(fields()[6].schema(), other.axisVectorLengths);
        fieldSetFlags()[6] = other.fieldSetFlags()[6];
      }
    }

    /**
     * Creates a Builder by copying an existing AttributeMetadataRecord instance
     * @param other The existing instance to copy.
     */
    private Builder(Energistics.Etp.v12.Datatypes.AttributeMetadataRecord other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.attributeId)) {
        this.attributeId = data().deepCopy(fields()[0].schema(), other.attributeId);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.attributeName)) {
        this.attributeName = data().deepCopy(fields()[1].schema(), other.attributeName);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.dataKind)) {
        this.dataKind = data().deepCopy(fields()[2].schema(), other.dataKind);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.uom)) {
        this.uom = data().deepCopy(fields()[3].schema(), other.uom);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.depthDatum)) {
        this.depthDatum = data().deepCopy(fields()[4].schema(), other.depthDatum);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.attributePropertyKindUri)) {
        this.attributePropertyKindUri = data().deepCopy(fields()[5].schema(), other.attributePropertyKindUri);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.axisVectorLengths)) {
        this.axisVectorLengths = data().deepCopy(fields()[6].schema(), other.axisVectorLengths);
        fieldSetFlags()[6] = true;
      }
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
    public Energistics.Etp.v12.Datatypes.AttributeMetadataRecord.Builder setAttributeId(int value) {
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
    public Energistics.Etp.v12.Datatypes.AttributeMetadataRecord.Builder clearAttributeId() {
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'attributeName' field.
      * @return The value.
      */
    public java.lang.CharSequence getAttributeName() {
      return attributeName;
    }


    /**
      * Sets the value of the 'attributeName' field.
      * @param value The value of 'attributeName'.
      * @return This builder.
      */
    public Energistics.Etp.v12.Datatypes.AttributeMetadataRecord.Builder setAttributeName(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.attributeName = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'attributeName' field has been set.
      * @return True if the 'attributeName' field has been set, false otherwise.
      */
    public boolean hasAttributeName() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'attributeName' field.
      * @return This builder.
      */
    public Energistics.Etp.v12.Datatypes.AttributeMetadataRecord.Builder clearAttributeName() {
      attributeName = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'dataKind' field.
      * @return The value.
      */
    public Energistics.Etp.v12.Datatypes.ChannelData.ChannelDataKind getDataKind() {
      return dataKind;
    }


    /**
      * Sets the value of the 'dataKind' field.
      * @param value The value of 'dataKind'.
      * @return This builder.
      */
    public Energistics.Etp.v12.Datatypes.AttributeMetadataRecord.Builder setDataKind(Energistics.Etp.v12.Datatypes.ChannelData.ChannelDataKind value) {
      validate(fields()[2], value);
      this.dataKind = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'dataKind' field has been set.
      * @return True if the 'dataKind' field has been set, false otherwise.
      */
    public boolean hasDataKind() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'dataKind' field.
      * @return This builder.
      */
    public Energistics.Etp.v12.Datatypes.AttributeMetadataRecord.Builder clearDataKind() {
      dataKind = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'uom' field.
      * @return The value.
      */
    public java.lang.CharSequence getUom() {
      return uom;
    }


    /**
      * Sets the value of the 'uom' field.
      * @param value The value of 'uom'.
      * @return This builder.
      */
    public Energistics.Etp.v12.Datatypes.AttributeMetadataRecord.Builder setUom(java.lang.CharSequence value) {
      validate(fields()[3], value);
      this.uom = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'uom' field has been set.
      * @return True if the 'uom' field has been set, false otherwise.
      */
    public boolean hasUom() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'uom' field.
      * @return This builder.
      */
    public Energistics.Etp.v12.Datatypes.AttributeMetadataRecord.Builder clearUom() {
      uom = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'depthDatum' field.
      * @return The value.
      */
    public java.lang.CharSequence getDepthDatum() {
      return depthDatum;
    }


    /**
      * Sets the value of the 'depthDatum' field.
      * @param value The value of 'depthDatum'.
      * @return This builder.
      */
    public Energistics.Etp.v12.Datatypes.AttributeMetadataRecord.Builder setDepthDatum(java.lang.CharSequence value) {
      validate(fields()[4], value);
      this.depthDatum = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'depthDatum' field has been set.
      * @return True if the 'depthDatum' field has been set, false otherwise.
      */
    public boolean hasDepthDatum() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'depthDatum' field.
      * @return This builder.
      */
    public Energistics.Etp.v12.Datatypes.AttributeMetadataRecord.Builder clearDepthDatum() {
      depthDatum = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /**
      * Gets the value of the 'attributePropertyKindUri' field.
      * @return The value.
      */
    public java.lang.CharSequence getAttributePropertyKindUri() {
      return attributePropertyKindUri;
    }


    /**
      * Sets the value of the 'attributePropertyKindUri' field.
      * @param value The value of 'attributePropertyKindUri'.
      * @return This builder.
      */
    public Energistics.Etp.v12.Datatypes.AttributeMetadataRecord.Builder setAttributePropertyKindUri(java.lang.CharSequence value) {
      validate(fields()[5], value);
      this.attributePropertyKindUri = value;
      fieldSetFlags()[5] = true;
      return this;
    }

    /**
      * Checks whether the 'attributePropertyKindUri' field has been set.
      * @return True if the 'attributePropertyKindUri' field has been set, false otherwise.
      */
    public boolean hasAttributePropertyKindUri() {
      return fieldSetFlags()[5];
    }


    /**
      * Clears the value of the 'attributePropertyKindUri' field.
      * @return This builder.
      */
    public Energistics.Etp.v12.Datatypes.AttributeMetadataRecord.Builder clearAttributePropertyKindUri() {
      attributePropertyKindUri = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    /**
      * Gets the value of the 'axisVectorLengths' field.
      * @return The value.
      */
    public java.util.List<java.lang.Integer> getAxisVectorLengths() {
      return axisVectorLengths;
    }


    /**
      * Sets the value of the 'axisVectorLengths' field.
      * @param value The value of 'axisVectorLengths'.
      * @return This builder.
      */
    public Energistics.Etp.v12.Datatypes.AttributeMetadataRecord.Builder setAxisVectorLengths(java.util.List<java.lang.Integer> value) {
      validate(fields()[6], value);
      this.axisVectorLengths = value;
      fieldSetFlags()[6] = true;
      return this;
    }

    /**
      * Checks whether the 'axisVectorLengths' field has been set.
      * @return True if the 'axisVectorLengths' field has been set, false otherwise.
      */
    public boolean hasAxisVectorLengths() {
      return fieldSetFlags()[6];
    }


    /**
      * Clears the value of the 'axisVectorLengths' field.
      * @return This builder.
      */
    public Energistics.Etp.v12.Datatypes.AttributeMetadataRecord.Builder clearAxisVectorLengths() {
      axisVectorLengths = null;
      fieldSetFlags()[6] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public AttributeMetadataRecord build() {
      try {
        AttributeMetadataRecord record = new AttributeMetadataRecord();
        record.attributeId = fieldSetFlags()[0] ? this.attributeId : (java.lang.Integer) defaultValue(fields()[0]);
        record.attributeName = fieldSetFlags()[1] ? this.attributeName : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.dataKind = fieldSetFlags()[2] ? this.dataKind : (Energistics.Etp.v12.Datatypes.ChannelData.ChannelDataKind) defaultValue(fields()[2]);
        record.uom = fieldSetFlags()[3] ? this.uom : (java.lang.CharSequence) defaultValue(fields()[3]);
        record.depthDatum = fieldSetFlags()[4] ? this.depthDatum : (java.lang.CharSequence) defaultValue(fields()[4]);
        record.attributePropertyKindUri = fieldSetFlags()[5] ? this.attributePropertyKindUri : (java.lang.CharSequence) defaultValue(fields()[5]);
        record.axisVectorLengths = fieldSetFlags()[6] ? this.axisVectorLengths : (java.util.List<java.lang.Integer>) defaultValue(fields()[6]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<AttributeMetadataRecord>
    WRITER$ = (org.apache.avro.io.DatumWriter<AttributeMetadataRecord>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<AttributeMetadataRecord>
    READER$ = (org.apache.avro.io.DatumReader<AttributeMetadataRecord>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    out.writeInt(this.attributeId);

    out.writeString(this.attributeName);

    out.writeEnum(this.dataKind.ordinal());

    out.writeString(this.uom);

    out.writeString(this.depthDatum);

    out.writeString(this.attributePropertyKindUri);

    long size0 = this.axisVectorLengths.size();
    out.writeArrayStart();
    out.setItemCount(size0);
    long actualSize0 = 0;
    for (java.lang.Integer e0: this.axisVectorLengths) {
      actualSize0++;
      out.startItem();
      out.writeInt(e0);
    }
    out.writeArrayEnd();
    if (actualSize0 != size0)
      throw new java.util.ConcurrentModificationException("Array-size written was " + size0 + ", but element count was " + actualSize0 + ".");

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      this.attributeId = in.readInt();

      this.attributeName = in.readString(this.attributeName instanceof Utf8 ? (Utf8)this.attributeName : null);

      this.dataKind = Energistics.Etp.v12.Datatypes.ChannelData.ChannelDataKind.values()[in.readEnum()];

      this.uom = in.readString(this.uom instanceof Utf8 ? (Utf8)this.uom : null);

      this.depthDatum = in.readString(this.depthDatum instanceof Utf8 ? (Utf8)this.depthDatum : null);

      this.attributePropertyKindUri = in.readString(this.attributePropertyKindUri instanceof Utf8 ? (Utf8)this.attributePropertyKindUri : null);

      long size0 = in.readArrayStart();
      java.util.List<java.lang.Integer> a0 = this.axisVectorLengths;
      if (a0 == null) {
        a0 = new SpecificData.Array<java.lang.Integer>((int)size0, SCHEMA$.getField("axisVectorLengths").schema());
        this.axisVectorLengths = a0;
      } else a0.clear();
      SpecificData.Array<java.lang.Integer> ga0 = (a0 instanceof SpecificData.Array ? (SpecificData.Array<java.lang.Integer>)a0 : null);
      for ( ; 0 < size0; size0 = in.arrayNext()) {
        for ( ; size0 != 0; size0--) {
          java.lang.Integer e0 = (ga0 != null ? ga0.peek() : null);
          e0 = in.readInt();
          a0.add(e0);
        }
      }

    } else {
      for (int i = 0; i < 7; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          this.attributeId = in.readInt();
          break;

        case 1:
          this.attributeName = in.readString(this.attributeName instanceof Utf8 ? (Utf8)this.attributeName : null);
          break;

        case 2:
          this.dataKind = Energistics.Etp.v12.Datatypes.ChannelData.ChannelDataKind.values()[in.readEnum()];
          break;

        case 3:
          this.uom = in.readString(this.uom instanceof Utf8 ? (Utf8)this.uom : null);
          break;

        case 4:
          this.depthDatum = in.readString(this.depthDatum instanceof Utf8 ? (Utf8)this.depthDatum : null);
          break;

        case 5:
          this.attributePropertyKindUri = in.readString(this.attributePropertyKindUri instanceof Utf8 ? (Utf8)this.attributePropertyKindUri : null);
          break;

        case 6:
          long size0 = in.readArrayStart();
          java.util.List<java.lang.Integer> a0 = this.axisVectorLengths;
          if (a0 == null) {
            a0 = new SpecificData.Array<java.lang.Integer>((int)size0, SCHEMA$.getField("axisVectorLengths").schema());
            this.axisVectorLengths = a0;
          } else a0.clear();
          SpecificData.Array<java.lang.Integer> ga0 = (a0 instanceof SpecificData.Array ? (SpecificData.Array<java.lang.Integer>)a0 : null);
          for ( ; 0 < size0; size0 = in.arrayNext()) {
            for ( ; size0 != 0; size0--) {
              java.lang.Integer e0 = (ga0 != null ? ga0.peek() : null);
              e0 = in.readInt();
              a0.add(e0);
            }
          }
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}









