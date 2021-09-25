/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package Energistics.Etp.v12.Protocol.Core;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class AuthorizeResponse extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 7776603398774132468L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"AuthorizeResponse\",\"namespace\":\"Energistics.Etp.v12.Protocol.Core\",\"fields\":[{\"name\":\"success\",\"type\":\"boolean\"},{\"name\":\"challenges\",\"type\":{\"type\":\"array\",\"items\":\"string\"}}],\"protocol\":\"0\",\"messageType\":\"7\",\"senderRole\":\"client,server\",\"protocolRoles\":\"client, server\",\"multipartFlag\":false,\"fullName\":\"Energistics.Etp.v12.Protocol.Core.AuthorizeResponse\",\"depends\":[]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<AuthorizeResponse> ENCODER =
      new BinaryMessageEncoder<AuthorizeResponse>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<AuthorizeResponse> DECODER =
      new BinaryMessageDecoder<AuthorizeResponse>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<AuthorizeResponse> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<AuthorizeResponse> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<AuthorizeResponse> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<AuthorizeResponse>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this AuthorizeResponse to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a AuthorizeResponse from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a AuthorizeResponse instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static AuthorizeResponse fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

   private boolean success;
   private java.util.List<java.lang.CharSequence> challenges;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public AuthorizeResponse() {}

  /**
   * All-args constructor.
   * @param success The new value for success
   * @param challenges The new value for challenges
   */
  public AuthorizeResponse(java.lang.Boolean success, java.util.List<java.lang.CharSequence> challenges) {
    this.success = success;
    this.challenges = challenges;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return success;
    case 1: return challenges;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: success = (java.lang.Boolean)value$; break;
    case 1: challenges = (java.util.List<java.lang.CharSequence>)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'success' field.
   * @return The value of the 'success' field.
   */
  public boolean getSuccess() {
    return success;
  }


  /**
   * Sets the value of the 'success' field.
   * @param value the value to set.
   */
  public void setSuccess(boolean value) {
    this.success = value;
  }

  /**
   * Gets the value of the 'challenges' field.
   * @return The value of the 'challenges' field.
   */
  public java.util.List<java.lang.CharSequence> getChallenges() {
    return challenges;
  }


  /**
   * Sets the value of the 'challenges' field.
   * @param value the value to set.
   */
  public void setChallenges(java.util.List<java.lang.CharSequence> value) {
    this.challenges = value;
  }

  /**
   * Creates a new AuthorizeResponse RecordBuilder.
   * @return A new AuthorizeResponse RecordBuilder
   */
  public static Energistics.Etp.v12.Protocol.Core.AuthorizeResponse.Builder newBuilder() {
    return new Energistics.Etp.v12.Protocol.Core.AuthorizeResponse.Builder();
  }

  /**
   * Creates a new AuthorizeResponse RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new AuthorizeResponse RecordBuilder
   */
  public static Energistics.Etp.v12.Protocol.Core.AuthorizeResponse.Builder newBuilder(Energistics.Etp.v12.Protocol.Core.AuthorizeResponse.Builder other) {
    if (other == null) {
      return new Energistics.Etp.v12.Protocol.Core.AuthorizeResponse.Builder();
    } else {
      return new Energistics.Etp.v12.Protocol.Core.AuthorizeResponse.Builder(other);
    }
  }

  /**
   * Creates a new AuthorizeResponse RecordBuilder by copying an existing AuthorizeResponse instance.
   * @param other The existing instance to copy.
   * @return A new AuthorizeResponse RecordBuilder
   */
  public static Energistics.Etp.v12.Protocol.Core.AuthorizeResponse.Builder newBuilder(Energistics.Etp.v12.Protocol.Core.AuthorizeResponse other) {
    if (other == null) {
      return new Energistics.Etp.v12.Protocol.Core.AuthorizeResponse.Builder();
    } else {
      return new Energistics.Etp.v12.Protocol.Core.AuthorizeResponse.Builder(other);
    }
  }

  /**
   * RecordBuilder for AuthorizeResponse instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<AuthorizeResponse>
    implements org.apache.avro.data.RecordBuilder<AuthorizeResponse> {

    private boolean success;
    private java.util.List<java.lang.CharSequence> challenges;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(Energistics.Etp.v12.Protocol.Core.AuthorizeResponse.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.success)) {
        this.success = data().deepCopy(fields()[0].schema(), other.success);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.challenges)) {
        this.challenges = data().deepCopy(fields()[1].schema(), other.challenges);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
    }

    /**
     * Creates a Builder by copying an existing AuthorizeResponse instance
     * @param other The existing instance to copy.
     */
    private Builder(Energistics.Etp.v12.Protocol.Core.AuthorizeResponse other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.success)) {
        this.success = data().deepCopy(fields()[0].schema(), other.success);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.challenges)) {
        this.challenges = data().deepCopy(fields()[1].schema(), other.challenges);
        fieldSetFlags()[1] = true;
      }
    }

    /**
      * Gets the value of the 'success' field.
      * @return The value.
      */
    public boolean getSuccess() {
      return success;
    }


    /**
      * Sets the value of the 'success' field.
      * @param value The value of 'success'.
      * @return This builder.
      */
    public Energistics.Etp.v12.Protocol.Core.AuthorizeResponse.Builder setSuccess(boolean value) {
      validate(fields()[0], value);
      this.success = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'success' field has been set.
      * @return True if the 'success' field has been set, false otherwise.
      */
    public boolean hasSuccess() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'success' field.
      * @return This builder.
      */
    public Energistics.Etp.v12.Protocol.Core.AuthorizeResponse.Builder clearSuccess() {
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'challenges' field.
      * @return The value.
      */
    public java.util.List<java.lang.CharSequence> getChallenges() {
      return challenges;
    }


    /**
      * Sets the value of the 'challenges' field.
      * @param value The value of 'challenges'.
      * @return This builder.
      */
    public Energistics.Etp.v12.Protocol.Core.AuthorizeResponse.Builder setChallenges(java.util.List<java.lang.CharSequence> value) {
      validate(fields()[1], value);
      this.challenges = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'challenges' field has been set.
      * @return True if the 'challenges' field has been set, false otherwise.
      */
    public boolean hasChallenges() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'challenges' field.
      * @return This builder.
      */
    public Energistics.Etp.v12.Protocol.Core.AuthorizeResponse.Builder clearChallenges() {
      challenges = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public AuthorizeResponse build() {
      try {
        AuthorizeResponse record = new AuthorizeResponse();
        record.success = fieldSetFlags()[0] ? this.success : (java.lang.Boolean) defaultValue(fields()[0]);
        record.challenges = fieldSetFlags()[1] ? this.challenges : (java.util.List<java.lang.CharSequence>) defaultValue(fields()[1]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<AuthorizeResponse>
    WRITER$ = (org.apache.avro.io.DatumWriter<AuthorizeResponse>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<AuthorizeResponse>
    READER$ = (org.apache.avro.io.DatumReader<AuthorizeResponse>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    out.writeBoolean(this.success);

    long size0 = this.challenges.size();
    out.writeArrayStart();
    out.setItemCount(size0);
    long actualSize0 = 0;
    for (java.lang.CharSequence e0: this.challenges) {
      actualSize0++;
      out.startItem();
      out.writeString(e0);
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
      this.success = in.readBoolean();

      long size0 = in.readArrayStart();
      java.util.List<java.lang.CharSequence> a0 = this.challenges;
      if (a0 == null) {
        a0 = new SpecificData.Array<java.lang.CharSequence>((int)size0, SCHEMA$.getField("challenges").schema());
        this.challenges = a0;
      } else a0.clear();
      SpecificData.Array<java.lang.CharSequence> ga0 = (a0 instanceof SpecificData.Array ? (SpecificData.Array<java.lang.CharSequence>)a0 : null);
      for ( ; 0 < size0; size0 = in.arrayNext()) {
        for ( ; size0 != 0; size0--) {
          java.lang.CharSequence e0 = (ga0 != null ? ga0.peek() : null);
          e0 = in.readString(e0 instanceof Utf8 ? (Utf8)e0 : null);
          a0.add(e0);
        }
      }

    } else {
      for (int i = 0; i < 2; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          this.success = in.readBoolean();
          break;

        case 1:
          long size0 = in.readArrayStart();
          java.util.List<java.lang.CharSequence> a0 = this.challenges;
          if (a0 == null) {
            a0 = new SpecificData.Array<java.lang.CharSequence>((int)size0, SCHEMA$.getField("challenges").schema());
            this.challenges = a0;
          } else a0.clear();
          SpecificData.Array<java.lang.CharSequence> ga0 = (a0 instanceof SpecificData.Array ? (SpecificData.Array<java.lang.CharSequence>)a0 : null);
          for ( ; 0 < size0; size0 = in.arrayNext()) {
            for ( ; size0 != 0; size0--) {
              java.lang.CharSequence e0 = (ga0 != null ? ga0.peek() : null);
              e0 = in.readString(e0 instanceof Utf8 ? (Utf8)e0 : null);
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










