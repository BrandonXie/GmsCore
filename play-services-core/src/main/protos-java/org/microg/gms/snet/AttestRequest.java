// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: protos-repo/snet.proto
package org.microg.gms.snet;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import okio.ByteString;

import static com.squareup.wire.Message.Datatype.BYTES;
import static com.squareup.wire.Message.Datatype.STRING;

public final class AttestRequest extends Message {

  public static final ByteString DEFAULT_SAFETYNETDATA = ByteString.EMPTY;
  public static final String DEFAULT_DROIDGUARDRESULT = "";

  @ProtoField(tag = 1, type = BYTES)
  public final ByteString safetyNetData;

  @ProtoField(tag = 2, type = STRING)
  public final String droidGuardResult;

  public AttestRequest(ByteString safetyNetData, String droidGuardResult) {
    this.safetyNetData = safetyNetData;
    this.droidGuardResult = droidGuardResult;
  }

  private AttestRequest(Builder builder) {
    this(builder.safetyNetData, builder.droidGuardResult);
    setBuilder(builder);
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof AttestRequest)) return false;
    AttestRequest o = (AttestRequest) other;
    return equals(safetyNetData, o.safetyNetData)
        && equals(droidGuardResult, o.droidGuardResult);
  }

  @Override
  public int hashCode() {
    int result = hashCode;
    if (result == 0) {
      result = safetyNetData != null ? safetyNetData.hashCode() : 0;
      result = result * 37 + (droidGuardResult != null ? droidGuardResult.hashCode() : 0);
      hashCode = result;
    }
    return result;
  }

  public static final class Builder extends Message.Builder<AttestRequest> {

    public ByteString safetyNetData;
    public String droidGuardResult;

    public Builder() {
    }

    public Builder(AttestRequest message) {
      super(message);
      if (message == null) return;
      this.safetyNetData = message.safetyNetData;
      this.droidGuardResult = message.droidGuardResult;
    }

    public Builder safetyNetData(ByteString safetyNetData) {
      this.safetyNetData = safetyNetData;
      return this;
    }

    public Builder droidGuardResult(String droidGuardResult) {
      this.droidGuardResult = droidGuardResult;
      return this;
    }

    @Override
    public AttestRequest build() {
      return new AttestRequest(this);
    }
  }
}