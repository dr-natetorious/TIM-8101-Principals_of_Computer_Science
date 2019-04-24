public class ryey.easer.plugins.event.i.a extends ryey.easer.plugins.event.a {
  public static final android.os.Parcelable$Creator<ryey.easer.plugins.event.i.a> CREATOR;

  java.util.Set<java.lang.Integer> a;

  static {};
    Code:
       0: new           #6                  // class ryey/easer/plugins/event/i/a$1
       3: dup
       4: invokespecial #19                 // Method ryey/easer/plugins/event/i/a$1."<init>":()V
       7: putstatic     #21                 // Field CREATOR:Landroid/os/Parcelable$Creator;
      10: return

  ryey.easer.plugins.event.i.a(android.os.Parcel, ryey.easer.plugins.event.i.a$1);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #46                 // Method "<init>":(Landroid/os/Parcel;)V
       5: return

  ryey.easer.plugins.event.i.a(java.lang.String, ryey.easer.b.a, int);
    Code:
       0: aload_0
       1: invokespecial #24                 // Method ryey/easer/plugins/event/a."<init>":()V
       4: aload_0
       5: new           #26                 // class android/support/v4/g/b
       8: dup
       9: bipush        7
      11: invokespecial #29                 // Method android/support/v4/g/b."<init>":(I)V
      14: putfield      #31                 // Field a:Ljava/util/Set;
      17: aload_0
      18: aload_1
      19: aload_2
      20: iload_3
      21: invokevirtual #49                 // Method a:(Ljava/lang/String;Lryey/easer/b/a;I)V
      24: return

  public ryey.easer.plugins.event.i.a(java.util.Set<java.lang.Integer>);
    Code:
       0: aload_0
       1: invokespecial #24                 // Method ryey/easer/plugins/event/a."<init>":()V
       4: aload_0
       5: new           #26                 // class android/support/v4/g/b
       8: dup
       9: bipush        7
      11: invokespecial #29                 // Method android/support/v4/g/b."<init>":(I)V
      14: putfield      #31                 // Field a:Ljava/util/Set;
      17: aload_0
      18: aload_1
      19: putfield      #31                 // Field a:Ljava/util/Set;
      22: return

  public java.lang.String a(ryey.easer.b.a);
    Code:
       0: getstatic     #56                 // Field ryey/easer/plugins/event/i/a$2.a:[I
       3: aload_1
       4: invokevirtual #62                 // Method ryey/easer/b/a.ordinal:()I
       7: iaload
       8: istore_2
       9: new           #64                 // class org/json/JSONArray
      12: dup
      13: invokespecial #65                 // Method org/json/JSONArray."<init>":()V
      16: astore_1
      17: aload_0
      18: getfield      #31                 // Field a:Ljava/util/Set;
      21: invokeinterface #71,  1           // InterfaceMethod java/util/Set.iterator:()Ljava/util/Iterator;
      26: astore_3
      27: aload_3
      28: invokeinterface #77,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
      33: ifeq          53
      36: aload_1
      37: aload_3
      38: invokeinterface #81,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
      43: checkcast     #83                 // class java/lang/Integer
      46: invokevirtual #87                 // Method org/json/JSONArray.put:(Ljava/lang/Object;)Lorg/json/JSONArray;
      49: pop
      50: goto          27
      53: aload_1
      54: invokevirtual #91                 // Method org/json/JSONArray.toString:()Ljava/lang/String;
      57: areturn

  public void a(java.lang.String, ryey.easer.b.a, int);
    Code:
       0: aload_0
       1: getfield      #31                 // Field a:Ljava/util/Set;
       4: invokeinterface #96,  1           // InterfaceMethod java/util/Set.clear:()V
       9: getstatic     #56                 // Field ryey/easer/plugins/event/i/a$2.a:[I
      12: aload_2
      13: invokevirtual #62                 // Method ryey/easer/b/a.ordinal:()I
      16: iaload
      17: istore_3
      18: new           #64                 // class org/json/JSONArray
      21: dup
      22: aload_1
      23: invokespecial #99                 // Method org/json/JSONArray."<init>":(Ljava/lang/String;)V
      26: astore_1
      27: iconst_0
      28: istore_3
      29: iload_3
      30: aload_1
      31: invokevirtual #102                // Method org/json/JSONArray.length:()I
      34: if_icmpge     62
      37: aload_0
      38: getfield      #31                 // Field a:Ljava/util/Set;
      41: aload_1
      42: iload_3
      43: invokevirtual #106                // Method org/json/JSONArray.getInt:(I)I
      46: invokestatic  #110                // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
      49: invokeinterface #114,  2          // InterfaceMethod java/util/Set.add:(Ljava/lang/Object;)Z
      54: pop
      55: iload_3
      56: iconst_1
      57: iadd
      58: istore_3
      59: goto          29
      62: return
      63: astore_1
      64: aload_1
      65: invokestatic  #119                // Method com/google/a/a/a/a/a/a.a:(Ljava/lang/Throwable;)V
      68: new           #121                // class ryey/easer/commons/local_plugin/b
      71: dup
      72: aload_1
      73: invokespecial #124                // Method ryey/easer/commons/local_plugin/b."<init>":(Ljava/lang/Exception;)V
      76: athrow
    Exception table:
       from    to  target type
          18    27    63   Class org/json/JSONException
          29    55    63   Class org/json/JSONException

  public boolean a();
    Code:
       0: aload_0
       1: getfield      #31                 // Field a:Ljava/util/Set;
       4: ifnonnull     9
       7: iconst_0
       8: ireturn
       9: aload_0
      10: getfield      #31                 // Field a:Ljava/util/Set;
      13: invokeinterface #127,  1          // InterfaceMethod java/util/Set.isEmpty:()Z
      18: ifeq          23
      21: iconst_0
      22: ireturn
      23: iconst_1
      24: ireturn

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
       1: ifnull        36
       4: aload_1
       5: instanceof    #2                  // class ryey/easer/plugins/event/i/a
       8: ifne          13
      11: iconst_0
      12: ireturn
      13: aload_0
      14: getfield      #31                 // Field a:Ljava/util/Set;
      17: aload_1
      18: checkcast     #2                  // class ryey/easer/plugins/event/i/a
      21: getfield      #31                 // Field a:Ljava/util/Set;
      24: invokeinterface #133,  2          // InterfaceMethod java/util/Set.equals:(Ljava/lang/Object;)Z
      29: ifne          34
      32: iconst_0
      33: ireturn
      34: iconst_1
      35: ireturn
      36: iconst_0
      37: ireturn

  public void writeToParcel(android.os.Parcel, int);
    Code:
       0: aload_1
       1: new           #33                 // class java/util/ArrayList
       4: dup
       5: aload_0
       6: getfield      #31                 // Field a:Ljava/util/Set;
       9: invokespecial #136                // Method java/util/ArrayList."<init>":(Ljava/util/Collection;)V
      12: invokevirtual #140                // Method android/os/Parcel.writeList:(Ljava/util/List;)V
      15: return
}
