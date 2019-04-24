public class ryey.easer.plugins.a.e.a implements ryey.easer.commons.local_plugin.a.a {
  public static final android.os.Parcelable$Creator<ryey.easer.plugins.a.e.a> CREATOR;

  java.util.Set<java.lang.Integer> a;

  static {};
    Code:
       0: new           #8                  // class ryey/easer/plugins/a/e/a$1
       3: dup
       4: invokespecial #21                 // Method ryey/easer/plugins/a/e/a$1."<init>":()V
       7: putstatic     #23                 // Field CREATOR:Landroid/os/Parcelable$Creator;
      10: return

  ryey.easer.plugins.a.e.a(android.os.Parcel, ryey.easer.plugins.a.e.a$1);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #46                 // Method "<init>":(Landroid/os/Parcel;)V
       5: return

  ryey.easer.plugins.a.e.a(java.lang.String, ryey.easer.b.a, int);
    Code:
       0: aload_0
       1: invokespecial #26                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: new           #28                 // class android/support/v4/g/b
       8: dup
       9: invokespecial #29                 // Method android/support/v4/g/b."<init>":()V
      12: putfield      #31                 // Field a:Ljava/util/Set;
      15: getstatic     #52                 // Field ryey/easer/plugins/a/e/a$2.a:[I
      18: aload_2
      19: invokevirtual #58                 // Method ryey/easer/b/a.ordinal:()I
      22: iaload
      23: istore_3
      24: getstatic     #52                 // Field ryey/easer/plugins/a/e/a$2.a:[I
      27: aload_2
      28: invokevirtual #58                 // Method ryey/easer/b/a.ordinal:()I
      31: iaload
      32: istore_3
      33: new           #60                 // class org/json/JSONArray
      36: dup
      37: aload_1
      38: invokespecial #63                 // Method org/json/JSONArray."<init>":(Ljava/lang/String;)V
      41: astore_1
      42: iconst_0
      43: istore_3
      44: iload_3
      45: aload_1
      46: invokevirtual #66                 // Method org/json/JSONArray.length:()I
      49: if_icmpge     77
      52: aload_0
      53: getfield      #31                 // Field a:Ljava/util/Set;
      56: aload_1
      57: iload_3
      58: invokevirtual #70                 // Method org/json/JSONArray.getInt:(I)I
      61: invokestatic  #76                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
      64: invokeinterface #82,  2           // InterfaceMethod java/util/Set.add:(Ljava/lang/Object;)Z
      69: pop
      70: iload_3
      71: iconst_1
      72: iadd
      73: istore_3
      74: goto          44
      77: return
      78: astore_1
      79: aload_1
      80: invokestatic  #87                 // Method com/google/a/a/a/a/a/a.a:(Ljava/lang/Throwable;)V
      83: new           #89                 // class ryey/easer/commons/local_plugin/b
      86: dup
      87: aload_1
      88: invokespecial #92                 // Method ryey/easer/commons/local_plugin/b."<init>":(Ljava/lang/Exception;)V
      91: athrow
    Exception table:
       from    to  target type
          33    42    78   Class org/json/JSONException
          44    70    78   Class org/json/JSONException

  ryey.easer.plugins.a.e.a(java.util.Set<java.lang.Integer>);
    Code:
       0: aload_0
       1: invokespecial #26                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: new           #28                 // class android/support/v4/g/b
       8: dup
       9: invokespecial #29                 // Method android/support/v4/g/b."<init>":()V
      12: putfield      #31                 // Field a:Ljava/util/Set;
      15: aload_0
      16: aload_1
      17: putfield      #31                 // Field a:Ljava/util/Set;
      20: return

  public java.lang.String a(ryey.easer.b.a);
    Code:
       0: getstatic     #52                 // Field ryey/easer/plugins/a/e/a$2.a:[I
       3: aload_1
       4: invokevirtual #58                 // Method ryey/easer/b/a.ordinal:()I
       7: iaload
       8: istore_2
       9: new           #60                 // class org/json/JSONArray
      12: dup
      13: invokespecial #97                 // Method org/json/JSONArray."<init>":()V
      16: astore_1
      17: aload_0
      18: getfield      #31                 // Field a:Ljava/util/Set;
      21: invokeinterface #101,  1          // InterfaceMethod java/util/Set.iterator:()Ljava/util/Iterator;
      26: astore_3
      27: aload_3
      28: invokeinterface #107,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
      33: ifeq          53
      36: aload_1
      37: aload_3
      38: invokeinterface #111,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
      43: checkcast     #72                 // class java/lang/Integer
      46: invokevirtual #115                // Method org/json/JSONArray.put:(Ljava/lang/Object;)Lorg/json/JSONArray;
      49: pop
      50: goto          27
      53: aload_1
      54: invokevirtual #119                // Method org/json/JSONArray.toString:()Ljava/lang/String;
      57: areturn

  public boolean a();
    Code:
       0: aload_0
       1: getfield      #31                 // Field a:Ljava/util/Set;
       4: invokeinterface #122,  1          // InterfaceMethod java/util/Set.size:()I
       9: ifle          14
      12: iconst_1
      13: ireturn
      14: iconst_0
      15: ireturn

  public int describeContents();
    Code:
       0: iconst_0
       1: ireturn

  public boolean equals(java.lang.Object);
    Code:
       0: aload_1
       1: aload_0
       2: if_acmpne     7
       5: iconst_1
       6: ireturn
       7: aload_1
       8: ifnull        43
      11: aload_1
      12: instanceof    #2                  // class ryey/easer/plugins/a/e/a
      15: ifne          20
      18: iconst_0
      19: ireturn
      20: aload_0
      21: getfield      #31                 // Field a:Ljava/util/Set;
      24: aload_1
      25: checkcast     #2                  // class ryey/easer/plugins/a/e/a
      28: getfield      #31                 // Field a:Ljava/util/Set;
      31: invokeinterface #126,  2          // InterfaceMethod java/util/Set.equals:(Ljava/lang/Object;)Z
      36: ifne          41
      39: iconst_0
      40: ireturn
      41: iconst_1
      42: ireturn
      43: iconst_0
      44: ireturn

  public void writeToParcel(android.os.Parcel, int);
    Code:
       0: aload_1
       1: new           #33                 // class java/util/ArrayList
       4: dup
       5: aload_0
       6: getfield      #31                 // Field a:Ljava/util/Set;
       9: invokespecial #129                // Method java/util/ArrayList."<init>":(Ljava/util/Collection;)V
      12: invokevirtual #133                // Method android/os/Parcel.writeList:(Ljava/util/List;)V
      15: return
}
