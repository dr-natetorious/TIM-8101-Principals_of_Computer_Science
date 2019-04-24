public class ryey.easer.plugins.operation.n.c implements ryey.easer.commons.local_plugin.c.b {
  public static final android.os.Parcelable$Creator<ryey.easer.plugins.operation.n.c> CREATOR;

  public final java.lang.String a;

  final boolean b;

  static {};
    Code:
       0: new           #8                  // class ryey/easer/plugins/operation/n/c$1
       3: dup
       4: invokespecial #22                 // Method ryey/easer/plugins/operation/n/c$1."<init>":()V
       7: putstatic     #24                 // Field CREATOR:Landroid/os/Parcelable$Creator;
      10: return

  ryey.easer.plugins.operation.n.c(android.os.Parcel, ryey.easer.plugins.operation.n.c$1);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #44                 // Method "<init>":(Landroid/os/Parcel;)V
       5: return

  ryey.easer.plugins.operation.n.c(java.lang.String, ryey.easer.b.a, int);
    Code:
       0: aload_0
       1: invokespecial #27                 // Method java/lang/Object."<init>":()V
       4: getstatic     #50                 // Field ryey/easer/plugins/operation/n/c$2.a:[I
       7: aload_2
       8: invokevirtual #56                 // Method ryey/easer/b/a.ordinal:()I
      11: iaload
      12: istore        4
      14: new           #58                 // class org/json/JSONObject
      17: dup
      18: aload_1
      19: invokespecial #61                 // Method org/json/JSONObject."<init>":(Ljava/lang/String;)V
      22: astore_2
      23: iload_3
      24: bipush        9
      26: if_icmpge     44
      29: aload_2
      30: ldc           #63                 // String event name
      32: invokevirtual #67                 // Method org/json/JSONObject.getString:(Ljava/lang/String;)Ljava/lang/String;
      35: astore_1
      36: aload_0
      37: aload_1
      38: putfield      #35                 // Field a:Ljava/lang/String;
      41: goto          54
      44: aload_2
      45: ldc           #69                 // String script name
      47: invokevirtual #67                 // Method org/json/JSONObject.getString:(Ljava/lang/String;)Ljava/lang/String;
      50: astore_1
      51: goto          36
      54: aload_0
      55: aload_2
      56: ldc           #71                 // String new status
      58: invokevirtual #75                 // Method org/json/JSONObject.getBoolean:(Ljava/lang/String;)Z
      61: putfield      #41                 // Field b:Z
      64: return
      65: astore_1
      66: new           #77                 // class ryey/easer/commons/local_plugin/b
      69: dup
      70: aload_1
      71: invokespecial #80                 // Method ryey/easer/commons/local_plugin/b."<init>":(Ljava/lang/Exception;)V
      74: athrow
    Exception table:
       from    to  target type
          14    23    65   Class org/json/JSONException
          29    36    65   Class org/json/JSONException
          36    41    65   Class org/json/JSONException
          44    51    65   Class org/json/JSONException
          54    64    65   Class org/json/JSONException

  ryey.easer.plugins.operation.n.c(java.lang.String, boolean);
    Code:
       0: aload_0
       1: invokespecial #27                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: aload_1
       6: putfield      #35                 // Field a:Ljava/lang/String;
       9: aload_0
      10: iload_2
      11: putfield      #41                 // Field b:Z
      14: return

  public ryey.easer.plugins.operation.n.c(ryey.easer.plugins.operation.n.c, java.lang.String);
    Code:
       0: aload_0
       1: invokespecial #27                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: aload_2
       6: putfield      #35                 // Field a:Ljava/lang/String;
       9: aload_0
      10: aload_1
      11: getfield      #41                 // Field b:Z
      14: putfield      #41                 // Field b:Z
      17: return

  public java.lang.String a(ryey.easer.b.a);
    Code:
       0: getstatic     #50                 // Field ryey/easer/plugins/operation/n/c$2.a:[I
       3: aload_1
       4: invokevirtual #56                 // Method ryey/easer/b/a.ordinal:()I
       7: iaload
       8: istore_2
       9: new           #58                 // class org/json/JSONObject
      12: dup
      13: invokespecial #84                 // Method org/json/JSONObject."<init>":()V
      16: astore_1
      17: aload_1
      18: ldc           #69                 // String script name
      20: aload_0
      21: getfield      #35                 // Field a:Ljava/lang/String;
      24: invokevirtual #88                 // Method org/json/JSONObject.put:(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
      27: pop
      28: aload_1
      29: ldc           #71                 // String new status
      31: aload_0
      32: getfield      #41                 // Field b:Z
      35: invokevirtual #91                 // Method org/json/JSONObject.put:(Ljava/lang/String;Z)Lorg/json/JSONObject;
      38: pop
      39: aload_1
      40: invokevirtual #94                 // Method org/json/JSONObject.toString:()Ljava/lang/String;
      43: astore_1
      44: aload_1
      45: areturn
      46: astore_1
      47: new           #96                 // class java/lang/IllegalStateException
      50: dup
      51: aload_1
      52: invokespecial #99                 // Method java/lang/IllegalStateException."<init>":(Ljava/lang/Throwable;)V
      55: athrow
    Exception table:
       from    to  target type
          17    44    46   Class org/json/JSONException

  public ryey.easer.commons.local_plugin.c.b a(ryey.easer.commons.local_plugin.b.c);
    Code:
       0: aload_0
       1: areturn

  public boolean a();
    Code:
       0: aload_0
       1: getfield      #35                 // Field a:Ljava/lang/String;
       4: invokestatic  #105                // Method ryey/easer/b.a:(Ljava/lang/String;)Z
       7: ifeq          12
      10: iconst_0
      11: ireturn
      12: iconst_1
      13: ireturn

  public boolean a(android.content.Context);
    Code:
       0: aload_0
       1: invokevirtual #108                // Method a:()Z
       4: ifne          9
       7: iconst_0
       8: ireturn
       9: new           #110                // class ryey/easer/core/a/a/e
      12: dup
      13: aload_1
      14: invokespecial #113                // Method ryey/easer/core/a/a/e."<init>":(Landroid/content/Context;)V
      17: invokevirtual #116                // Method ryey/easer/core/a/a/e.a:()Ljava/util/List;
      20: aload_0
      21: getfield      #35                 // Field a:Ljava/lang/String;
      24: invokeinterface #122,  2          // InterfaceMethod java/util/List.contains:(Ljava/lang/Object;)Z
      29: ifne          34
      32: iconst_0
      33: ireturn
      34: iconst_1
      35: ireturn

  public java.util.Set<java.lang.String> b();
    Code:
       0: aconst_null
       1: areturn

  public int describeContents();
    Code:
       0: iconst_0
       1: ireturn

  public boolean equals(java.lang.Object);
    Code:
       0: aload_1
       1: ifnonnull     6
       4: iconst_0
       5: ireturn
       6: aload_1
       7: instanceof    #2                  // class ryey/easer/plugins/operation/n/c
      10: ifne          15
      13: iconst_0
      14: ireturn
      15: aload_0
      16: getfield      #35                 // Field a:Ljava/lang/String;
      19: astore_2
      20: aload_1
      21: checkcast     #2                  // class ryey/easer/plugins/operation/n/c
      24: astore_1
      25: aload_2
      26: aload_1
      27: getfield      #35                 // Field a:Ljava/lang/String;
      30: invokevirtual #131                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
      33: ifne          38
      36: iconst_0
      37: ireturn
      38: aload_0
      39: getfield      #41                 // Field b:Z
      42: aload_1
      43: getfield      #41                 // Field b:Z
      46: if_icmpeq     51
      49: iconst_0
      50: ireturn
      51: iconst_1
      52: ireturn

  public void writeToParcel(android.os.Parcel, int);
    Code:
       0: aload_1
       1: aload_0
       2: getfield      #35                 // Field a:Ljava/lang/String;
       5: invokevirtual #136                // Method android/os/Parcel.writeString:(Ljava/lang/String;)V
       8: aload_1
       9: aload_0
      10: getfield      #41                 // Field b:Z
      13: i2b
      14: invokevirtual #140                // Method android/os/Parcel.writeByte:(B)V
      17: return
}
