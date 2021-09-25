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
public class ArrayOfNullableBoolean extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -5235029236955731746L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"ArrayOfNullableBoolean\",\"namespace\":\"Energistics.Etp.v12.Datatypes\",\"fields\":[{\"name\":\"values\",\"type\":{\"type\":\"array\",\"items\":[\"null\",\"boolean\"]}}],\"fullName\":\"Energistics.Etp.v12.Datatypes.ArrayOfNullableBoolean\",\"depends\":[]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<ArrayOfNullableBoolean> ENCODER =
      new BinaryMessageEncoder<ArrayOfNullableBoolean>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<ArrayOfNullableBoolean> DECODER =
      new BinaryMessageDecoder<ArrayOfNullableBoolean>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<ArrayOfNullableBoolean> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<ArrayOfNullableBoolean> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<ArrayOfNullableBoolean> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<ArrayOfNullableBoolean>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this ArrayOfNullableBoolean to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a ArrayOfNullableBoolean from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a ArrayOfNullableBoolean instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static ArrayOfNullableBoolean fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

   private java.util.List<java.lang.Boolean> values;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public ArrayOfNullableBoolean() {}

  /**
   * All-args constructor.
   * @param values The new value for values
   */
  public ArrayOfNullableBoolean(java.util.List<java.lang.Boolean> values) {
    this.values = values;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return values;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: values = (java.util.List<java.lang.Boolean>)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'values' field.
   * @return The value of the 'values' field.
   */
  public java.util.List<java.lang.Boolean> getValues() {
    return values;
  }


  /**
   * Sets the value of the 'values' field.
   * @param value the value to set.
   */
  public void setValues(java.util.List<java.lang.Boolean> value) {
    this.values = value;
  }

  /**
   * Creates a new ArrayOfNullableBoolean RecordBuilder.
   * @return A new ArrayOfNullableBoolean RecordBuilder
   */
  public static Energistics.Etp.v12.Datatypes.ArrayOfNullableBoolean.Builder newBuilder() {
    return new Energistics.Etp.v12.Datatypes.ArrayOfNullableBoolean.Builder();
  }

  /**
   * Creates a new ArrayOfNullableBoolean RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new ArrayOfNullableBoolean RecordBuilder
   */
  public static Energistics.Etp.v12.Datatypes.ArrayOfNullableBoolean.Builder newBuilder(Energistics.Etp.v12.Datatypes.ArrayOfNullableBoolean.Builder other) {
    if (other == null) {
      return new Energistics.Etp.v12.Datatypes.ArrayOfNullableBoolean.Builder();
    } else {
      return new Energistics.Etp.v12.Datatypes.ArrayOfNullableBoolean.Builder(other);
    }
  }

  /**
   * Creates a new ArrayOfNullableBoolean RecordBuilder by copying an existing ArrayOfNullableBoolean instance.
   * @param other The existing instance to copy.
   * @return A new ArrayOfNullableBoolean RecordBuilder
   */
  public static Energistics.Etp.v12.Datatypes.ArrayOfNullableBoolean.Builder newBuilder(Energistics.Etp.v12.Datatypes.ArrayOfNullableBoolean other) {
    if (other == null) {
      return new Energistics.Etp.v12.Datatypes.ArrayOfNullableBoolean.Builder();
    } else {
      return new Energistics.Etp.v12.Datatypes.ArrayOfNullableBoolean.Builder(other);
    }
  }

  /**
   * RecordBuilder for ArrayOfNullableBoolean instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<ArrayOfNullableBoolean>
    implements org.apache.avro.data.RecordBuilder<ArrayOfNullableBoolean> {

    private java.util.List<java.lang.Boolean> values;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(Energistics.Etp.v12.Datatypes.ArrayOfNullableBoolean.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.values)) {
        this.values = data().deepCopy(fields()[0].schema(), other.values);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
    }

    /**
     * Creates a Builder by copying an existing ArrayOfNullableBoolean instance
     * @param other The existing instance to copy.
     */
    private Builder(Energistics.Etp.v12.Datatypes.ArrayOfNullableBoolean other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.values)) {
        this.values = data().deepCopy(fields()[0].schema(), other.values);
        fieldSetFlags()[0] = true;
      }
    }

    /**
      * Gets the value of the 'values' field.
      * @return The value.
      */
    public java.util.List<java.lang.Boolean> getValues() {
      return values;
    }


    /**
      * Sets the value of the 'values' field.
      * @param value The value of 'values'.
      * @return This builder.
      */
    public Energistics.Etp.v12.Datatypes.ArrayOfNullableBoolean.Builder setValues(java.util.List<java.lang.Boolean> value) {
      validate(fields()[0], value);
      this.values = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'values' field has been set.
      * @return True if the 'values' field has been set, false otherwise.
      */
    public boolean hasValues() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'values' field.
      * @return This builder.
      */
    public Energistics.Etp.v12.Datatypes.ArrayOfNullableBoolean.Builder clearValues() {
      values = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public ArrayOfNullableBoolean build() {
      try {
        ArrayOfNullableBoolean record = new ArrayOfNullableBoolean();
        record.values = fieldSetFlags()[0] ? this.values : (java.util.List<java.lang.Boolean>) defaultValue(fields()[0]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<ArrayOfNullableBoolean>
    WRITER$ = (org.apache.avro.io.DatumWriter<ArrayOfNullableBoolean>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<ArrayOfNullableBoolean>
    READER$ = (org.apache.avro.io.DatumReader<ArrayOfNullableBoolean>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    long size0 = this.values.size();
    out.writeArrayStart();
    out.setItemCount(size0);
    long actualSize0 = 0;
    for (java.lang.Boolean e0: this.values) {
      actualSize0++;
      out.startItem();
      if (e0 == null) {
        out.writeIndex(0);
        out.writeNull();
      } else {
        out.writeIndex(1);
        out.writeBoolean(e0);
      }
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
      long size0 = in.readArrayStart();
      java.util.List<java.lang.Boolean> a0 = this.values;
      if (a0 == null) {
        a0 = new SpecificData.Array<java.lang.Boolean>((int)size0, SCHEMA$.getField("values").schema());
        this.values = a0;
      } else a0.clear();
      SpecificData.Array<java.lang.Boolean> ga0 = (a0 instanceof SpecificData.Array ? (SpecificData.Array<java.lang.Boolean>)a0 : null);
      for ( ; 0 < size0; size0 = in.arrayNext()) {
        for ( ; size0 != 0; size0--) {
          java.lang.Boolean e0 = (ga0 != null ? ga0.peek() : null);
          if (in.readIndex() != 1) {
            in.readNull();
            e0 = null;
          } else {
            e0 = in.readBoolean();
          }
          a0.add(e0);
        }
      }

    } else {
      for (int i = 0; i < 1; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          long size0 = in.readArrayStart();
          java.util.List<java.lang.Boolean> a0 = this.values;
          if (a0 == null) {
            a0 = new SpecificData.Array<java.lang.Boolean>((int)size0, SCHEMA$.getField("values").schema());
            this.values = a0;
          } else a0.clear();
          SpecificData.Array<java.lang.Boolean> ga0 = (a0 instanceof SpecificData.Array ? (SpecificData.Array<java.lang.Boolean>)a0 : null);
          for ( ; 0 < size0; size0 = in.arrayNext()) {
            for ( ; size0 != 0; size0--) {
              java.lang.Boolean e0 = (ga0 != null ? ga0.peek() : null);
              if (in.readIndex() != 1) {
                in.readNull();
                e0 = null;
              } else {
                e0 = in.readBoolean();
              }
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









