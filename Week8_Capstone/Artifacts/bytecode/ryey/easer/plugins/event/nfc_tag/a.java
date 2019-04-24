public class ryey.easer.plugins.event.nfc_tag.a extends ryey.easer.plugins.event.a {
  public static final android.os.Parcelable$Creator<ryey.easer.plugins.event.nfc_tag.a> CREATOR;

  byte[] a;

  static {};
    Code:
       0: new           #6                  // class ryey/easer/plugins/event/nfc_tag/a$1
       3: dup
       4: invokespecial #18                 // Method ryey/easer/plugins/event/nfc_tag/a$1."<init>":()V
       7: putstatic     #20                 // Field CREATOR:Landroid/os/Parcelable$Creator;
      10: return

  ryey.easer.plugins.event.nfc_tag.a();
    Code:
       0: aload_0
       1: invokespecial #22                 // Method ryey/easer/plugins/event/a."<init>":()V
       4: return

  ryey.easer.plugins.event.nfc_tag.a(android.os.Parcel, ryey.easer.plugins.event.nfc_tag.a$1);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #38                 // Method "<init>":(Landroid/os/Parcel;)V
       5: return

  ryey.easer.plugins.event.nfc_tag.a(java.lang.String);
    Code:
       0: aload_0
       1: invokespecial #22                 // Method ryey/easer/plugins/event/a."<init>":()V
       4: aload_0
       5: aload_1
       6: invokestatic  #42                 // Method a:(Ljava/lang/String;)[B
       9: putfield      #31                 // Field a:[B
      12: return

  ryey.easer.plugins.event.nfc_tag.a(java.lang.String, ryey.easer.b.a, int);
    Code:
       0: aload_0
       1: invokespecial #22                 // Method ryey/easer/plugins/event/a."<init>":()V
       4: aload_0
       5: aload_1
       6: aload_2
       7: iload_3
       8: invokevirtual #45                 // Method a:(Ljava/lang/String;Lryey/easer/b/a;I)V
      11: return

  static java.lang.String a(byte[]);
    Code:
       0: aload_0
       1: arraylength
       2: iconst_2
       3: imul
       4: newarray       char
       6: astore        4
       8: iconst_0
       9: istore_1
      10: iload_1
      11: aload_0
      12: arraylength
      13: if_icmpge     62
      16: aload_0
      17: iload_1
      18: baload
      19: sipush        255
      22: iand
      23: istore_2
      24: iload_1
      25: iconst_2
      26: imul
      27: istore_3
      28: aload         4
      30: iload_3
      31: iload_2
      32: iconst_4
      33: iushr
      34: bipush        16
      36: invokestatic  #52                 // Method java/lang/Character.forDigit:(II)C
      39: castore
      40: aload         4
      42: iload_3
      43: iconst_1
      44: iadd
      45: iload_2
      46: bipush        15
      48: iand
      49: bipush        16
      51: invokestatic  #52                 // Method java/lang/Character.forDigit:(II)C
      54: castore
      55: iload_1
      56: iconst_1
      57: iadd
      58: istore_1
      59: goto          10
      62: new           #54                 // class java/lang/String
      65: dup
      66: aload         4
      68: invokespecial #57                 // Method java/lang/String."<init>":([C)V
      71: areturn

  static byte[] a(java.lang.String);
    Code:
       0: aload_0
       1: invokevirtual #60                 // Method java/lang/String.length:()I
       4: istore_2
       5: iload_2
       6: iconst_2
       7: idiv
       8: newarray       byte
      10: astore_3
      11: iconst_0
      12: istore_1
      13: iload_1
      14: iload_2
      15: if_icmpge     56
      18: aload_3
      19: iload_1
      20: iconst_2
      21: idiv
      22: aload_0
      23: iload_1
      24: invokevirtual #64                 // Method java/lang/String.charAt:(I)C
      27: bipush        16
      29: invokestatic  #68                 // Method java/lang/Character.digit:(CI)I
      32: iconst_4
      33: ishl
      34: aload_0
      35: iload_1
      36: iconst_1
      37: iadd
      38: invokevirtual #64                 // Method java/lang/String.charAt:(I)C
      41: bipush        16
      43: invokestatic  #68                 // Method java/lang/Character.digit:(CI)I
      46: iadd
      47: i2b
      48: bastore
      49: iload_1
      50: iconst_2
      51: iadd
      52: istore_1
      53: goto          13
      56: aload_3
      57: areturn

  public java.lang.String a(ryey.easer.b.a);
    Code:
       0: getstatic     #74                 // Field ryey/easer/plugins/event/nfc_tag/a$2.a:[I
       3: aload_1
       4: invokevirtual #79                 // Method ryey/easer/b/a.ordinal:()I
       7: iaload
       8: istore_2
       9: new           #81                 // class org/json/JSONObject
      12: dup
      13: invokespecial #82                 // Method org/json/JSONObject."<init>":()V
      16: astore_1
      17: aload_1
      18: ldc           #84                 // String id
      20: aload_0
      21: getfield      #31                 // Field a:[B
      24: invokestatic  #86                 // Method a:([B)Ljava/lang/String;
      27: invokevirtual #90                 // Method org/json/JSONObject.put:(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
      30: pop
      31: aload_1
      32: invokevirtual #94                 // Method org/json/JSONObject.toString:()Ljava/lang/String;
      35: areturn
      36: astore_1
      37: aload_1
      38: invokestatic  #99                 // Method com/google/a/a/a/a/a/a.a:(Ljava/lang/Throwable;)V
      41: new           #101                // class java/lang/IllegalStateException
      44: dup
      45: invokespecial #102                // Method java/lang/IllegalStateException."<init>":()V
      48: athrow
    Exception table:
       from    to  target type
          17    31    36   Class org/json/JSONException

  public void a(java.lang.String, ryey.easer.b.a, int);
    Code:
       0: getstatic     #74                 // Field ryey/easer/plugins/event/nfc_tag/a$2.a:[I
       3: aload_2
       4: invokevirtual #79                 // Method ryey/easer/b/a.ordinal:()I
       7: iaload
       8: istore_3
       9: aload_0
      10: new           #81                 // class org/json/JSONObject
      13: dup
      14: aload_1
      15: invokespecial #104                // Method org/json/JSONObject."<init>":(Ljava/lang/String;)V
      18: ldc           #84                 // String id
      20: invokevirtual #108                // Method org/json/JSONObject.getString:(Ljava/lang/String;)Ljava/lang/String;
      23: invokestatic  #42                 // Method a:(Ljava/lang/String;)[B
      26: putfield      #31                 // Field a:[B
      29: return
      30: astore_1
      31: aload_1
      32: invokestatic  #99                 // Method com/google/a/a/a/a/a/a.a:(Ljava/lang/Throwable;)V
      35: new           #110                // class ryey/easer/commons/local_plugin/b
      38: dup
      39: aload_1
      40: invokespecial #113                // Method ryey/easer/commons/local_plugin/b."<init>":(Ljava/lang/Exception;)V
      43: athrow
    Exception table:
       from    to  target type
           9    29    30   Class org/json/JSONException

  public boolean a();
    Code:
       0: aload_0
       1: getfield      #31                 // Field a:[B
       4: ifnonnull     9
       7: iconst_0
       8: ireturn
       9: iconst_1
      10: ireturn

  public int describeContents();
    Code:
       0: iconst_0
       1: ireturn

  public ryey.easer.commons.local_plugin.b.a[] dynamics();
    Code:
       0: aconst_null
       1: areturn

  public boolean equals(java.lang.Object);
    Code:
       0: aload_1
       1: ifnull        29
       4: aload_1
       5: instanceof    #2                  // class ryey/easer/plugins/event/nfc_tag/a
       8: ifne          14
      11: goto          29
      14: aload_0
      15: getfield      #31                 // Field a:[B
      18: aload_1
      19: checkcast     #2                  // class ryey/easer/plugins/event/nfc_tag/a
      22: getfield      #31                 // Field a:[B
      25: invokestatic  #124                // Method java/util/Arrays.equals:([B[B)Z
      28: ireturn
      29: iconst_0
      30: ireturn

  public java.lang.String toString();
    Code:
       0: aload_0
       1: getfield      #31                 // Field a:[B
       4: invokestatic  #86                 // Method a:([B)Ljava/lang/String;
       7: areturn

  public void writeToParcel(android.os.Parcel, int);
    Code:
       0: aload_1
       1: aload_0
       2: getfield      #31                 // Field a:[B
       5: arraylength
       6: invokevirtual #130                // Method android/os/Parcel.writeInt:(I)V
       9: aload_1
      10: aload_0
      11: getfield      #31                 // Field a:[B
      14: invokevirtual #133                // Method android/os/Parcel.writeByteArray:([B)V
      17: return
}
