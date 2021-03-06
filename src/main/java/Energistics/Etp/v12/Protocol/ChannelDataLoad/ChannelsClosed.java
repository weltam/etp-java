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
public class ChannelsClosed extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 7380841885869769298L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"ChannelsClosed\",\"namespace\":\"Energistics.Etp.v12.Protocol.ChannelDataLoad\",\"fields\":[{\"name\":\"reason\",\"type\":\"string\"},{\"name\":\"id\",\"type\":{\"type\":\"map\",\"values\":\"long\"}}],\"protocol\":\"22\",\"messageType\":\"7\",\"senderRole\":\"store\",\"protocolRoles\":\"store,customer\",\"multipartFlag\":true,\"fullName\":\"Energistics.Etp.v12.Protocol.ChannelDataLoad.ChannelsClosed\",\"depends\":[]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<ChannelsClosed> ENCODER =
      new BinaryMessageEncoder<ChannelsClosed>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<ChannelsClosed> DECODER =
      new BinaryMessageDecoder<ChannelsClosed>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<ChannelsClosed> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<ChannelsClosed> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<ChannelsClosed> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<ChannelsClosed>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this ChannelsClosed to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a ChannelsClosed from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a ChannelsClosed instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static ChannelsClosed fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

   private java.lang.CharSequence reason;
   private java.util.Map<java.lang.CharSequence,java.lang.Long> id;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public ChannelsClosed() {}

  /**
   * All-args constructor.
   * @param reason The new value for reason
   * @param id The new value for id
   */
  public ChannelsClosed(java.lang.CharSequence reason, java.util.Map<java.lang.CharSequence,java.lang.Long> id) {
    this.reason = reason;
    this.id = id;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return reason;
    case 1: return id;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: reason = (java.lang.CharSequence)value$; break;
    case 1: id = (java.util.Map<java.lang.CharSequence,java.lang.Long>)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'reason' field.
   * @return The value of the 'reason' field.
   */
  public java.lang.CharSequence getReason() {
    return reason;
  }


  /**
   * Sets the value of the 'reason' field.
   * @param value the value to set.
   */
  public void setReason(java.lang.CharSequence value) {
    this.reason = value;
  }

  /**
   * Gets the value of the 'id' field.
   * @return The value of the 'id' field.
   */
  public java.util.Map<java.lang.CharSequence,java.lang.Long> getId() {
    return id;
  }


  /**
   * Sets the value of the 'id' field.
   * @param value the value to set.
   */
  public void setId(java.util.Map<java.lang.CharSequence,java.lang.Long> value) {
    this.id = value;
  }

  /**
   * Creates a new ChannelsClosed RecordBuilder.
   * @return A new ChannelsClosed RecordBuilder
   */
  public static Energistics.Etp.v12.Protocol.ChannelDataLoad.ChannelsClosed.Builder newBuilder() {
    return new Energistics.Etp.v12.Protocol.ChannelDataLoad.ChannelsClosed.Builder();
  }

  /**
   * Creates a new ChannelsClosed RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new ChannelsClosed RecordBuilder
   */
  public static Energistics.Etp.v12.Protocol.ChannelDataLoad.ChannelsClosed.Builder newBuilder(Energistics.Etp.v12.Protocol.ChannelDataLoad.ChannelsClosed.Builder other) {
    if (other == null) {
      return new Energistics.Etp.v12.Protocol.ChannelDataLoad.ChannelsClosed.Builder();
    } else {
      return new Energistics.Etp.v12.Protocol.ChannelDataLoad.ChannelsClosed.Builder(other);
    }
  }

  /**
   * Creates a new ChannelsClosed RecordBuilder by copying an existing ChannelsClosed instance.
   * @param other The existing instance to copy.
   * @return A new ChannelsClosed RecordBuilder
   */
  public static Energistics.Etp.v12.Protocol.ChannelDataLoad.ChannelsClosed.Builder newBuilder(Energistics.Etp.v12.Protocol.ChannelDataLoad.ChannelsClosed other) {
    if (other == null) {
      return new Energistics.Etp.v12.Protocol.ChannelDataLoad.ChannelsClosed.Builder();
    } else {
      return new Energistics.Etp.v12.Protocol.ChannelDataLoad.ChannelsClosed.Builder(other);
    }
  }

  /**
   * RecordBuilder for ChannelsClosed instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<ChannelsClosed>
    implements org.apache.avro.data.RecordBuilder<ChannelsClosed> {

    private java.lang.CharSequence reason;
    private java.util.Map<java.lang.CharSequence,java.lang.Long> id;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(Energistics.Etp.v12.Protocol.ChannelDataLoad.ChannelsClosed.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.reason)) {
        this.reason = data().deepCopy(fields()[0].schema(), other.reason);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.id)) {
        this.id = data().deepCopy(fields()[1].schema(), other.id);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
    }

    /**
     * Creates a Builder by copying an existing ChannelsClosed instance
     * @param other The existing instance to copy.
     */
    private Builder(Energistics.Etp.v12.Protocol.ChannelDataLoad.ChannelsClosed other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.reason)) {
        this.reason = data().deepCopy(fields()[0].schema(), other.reason);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.id)) {
        this.id = data().deepCopy(fields()[1].schema(), other.id);
        fieldSetFlags()[1] = true;
      }
    }

    /**
      * Gets the value of the 'reason' field.
      * @return The value.
      */
    public java.lang.CharSequence getReason() {
      return reason;
    }


    /**
      * Sets the value of the 'reason' field.
      * @param value The value of 'reason'.
      * @return This builder.
      */
    public Energistics.Etp.v12.Protocol.ChannelDataLoad.ChannelsClosed.Builder setReason(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.reason = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'reason' field has been set.
      * @return True if the 'reason' field has been set, false otherwise.
      */
    public boolean hasReason() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'reason' field.
      * @return This builder.
      */
    public Energistics.Etp.v12.Protocol.ChannelDataLoad.ChannelsClosed.Builder clearReason() {
      reason = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'id' field.
      * @return The value.
      */
    public java.util.Map<java.lang.CharSequence,java.lang.Long> getId() {
      return id;
    }


    /**
      * Sets the value of the 'id' field.
      * @param value The value of 'id'.
      * @return This builder.
      */
    public Energistics.Etp.v12.Protocol.ChannelDataLoad.ChannelsClosed.Builder setId(java.util.Map<java.lang.CharSequence,java.lang.Long> value) {
      validate(fields()[1], value);
      this.id = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'id' field has been set.
      * @return True if the 'id' field has been set, false otherwise.
      */
    public boolean hasId() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'id' field.
      * @return This builder.
      */
    public Energistics.Etp.v12.Protocol.ChannelDataLoad.ChannelsClosed.Builder clearId() {
      id = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public ChannelsClosed build() {
      try {
        ChannelsClosed record = new ChannelsClosed();
        record.reason = fieldSetFlags()[0] ? this.reason : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.id = fieldSetFlags()[1] ? this.id : (java.util.Map<java.lang.CharSequence,java.lang.Long>) defaultValue(fields()[1]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<ChannelsClosed>
    WRITER$ = (org.apache.avro.io.DatumWriter<ChannelsClosed>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<ChannelsClosed>
    READER$ = (org.apache.avro.io.DatumReader<ChannelsClosed>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    out.writeString(this.reason);

    long size0 = this.id.size();
    out.writeMapStart();
    out.setItemCount(size0);
    long actualSize0 = 0;
    for (java.util.Map.Entry<java.lang.CharSequence, java.lang.Long> e0: this.id.entrySet()) {
      actualSize0++;
      out.startItem();
      out.writeString(e0.getKey());
      java.lang.Long v0 = e0.getValue();
      out.writeLong(v0);
    }
    out.writeMapEnd();
    if (actualSize0 != size0)
      throw new java.util.ConcurrentModificationException("Map-size written was " + size0 + ", but element count was " + actualSize0 + ".");

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      this.reason = in.readString(this.reason instanceof Utf8 ? (Utf8)this.reason : null);

      long size0 = in.readMapStart();
      java.util.Map<java.lang.CharSequence,java.lang.Long> m0 = this.id; // Need fresh name due to limitation of macro system
      if (m0 == null) {
        m0 = new java.util.HashMap<java.lang.CharSequence,java.lang.Long>((int)size0);
        this.id = m0;
      } else m0.clear();
      for ( ; 0 < size0; size0 = in.mapNext()) {
        for ( ; size0 != 0; size0--) {
          java.lang.CharSequence k0 = null;
          k0 = in.readString(k0 instanceof Utf8 ? (Utf8)k0 : null);
          java.lang.Long v0 = null;
          v0 = in.readLong();
          m0.put(k0, v0);
        }
      }

    } else {
      for (int i = 0; i < 2; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          this.reason = in.readString(this.reason instanceof Utf8 ? (Utf8)this.reason : null);
          break;

        case 1:
          long size0 = in.readMapStart();
          java.util.Map<java.lang.CharSequence,java.lang.Long> m0 = this.id; // Need fresh name due to limitation of macro system
          if (m0 == null) {
            m0 = new java.util.HashMap<java.lang.CharSequence,java.lang.Long>((int)size0);
            this.id = m0;
          } else m0.clear();
          for ( ; 0 < size0; size0 = in.mapNext()) {
            for ( ; size0 != 0; size0--) {
              java.lang.CharSequence k0 = null;
              k0 = in.readString(k0 instanceof Utf8 ? (Utf8)k0 : null);
              java.lang.Long v0 = null;
              v0 = in.readLong();
              m0.put(k0, v0);
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










