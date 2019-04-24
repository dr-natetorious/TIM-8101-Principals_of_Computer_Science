public class ryey.easer.plugins.a.g.a implements ryey.easer.commons.local_plugin.a.a {
  public static final android.os.Parcelable$Creator<ryey.easer.plugins.a.g.a> CREATOR;

  java.util.Set<java.lang.Integer> a;

  static {};
    Code:
       0: new           #8                  // class ryey/easer/plugins/a/g/a$1
       3: dup
       4: invokespecial #21                 // Method ryey/easer/plugins/a/g/a$1."<init>":()V
       7: putstatic     #23                 // Field CREATOR:Landroid/os/Parcelable$Creator;
      10: return

  ryey.easer.plugins.a.g.a(android.os.Parcel, ryey.easer.plugins.a.g.a$1);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #48                 // Method "<init>":(Landroid/os/Parcel;)V
       5: return

  ryey.easer.plugins.a.g.a(java.lang.String, ryey.easer.b.a, int);
    Code:
       0: aload_0
       1: invokespecial #26                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: new           #28                 // class android/support/v4/g/b
       8: dup
       9: bipush        7
      11: invokespecial #31                 // Method android/support/v4/g/b."<init>":(I)V
      14: putfield      #33                 // Field a:Ljava/util/Set;
      17: getstatic     #54                 // Field ryey/easer/plugins/a/g/a$2.a:[I
      20: aload_2
      21: invokevirtual #60                 // Method ryey/easer/b/a.ordinal:()I
      24: iaload
      25: istore_3
      26: new           #62                 // class org/json/JSONArray
      29: dup
      30: aload_1
      31: invokespecial #65                 // Method org/json/JSONArray."<init>":(Ljava/lang/String;)V
      34: astore_1
      35: iconst_0
      36: istore_3
      37: iload_3
      38: aload_1
      39: invokevirtual #68                 // Method org/json/JSONArray.length:()I
      42: if_icmpge     70
      45: aload_0
      46: getfield      #33                 // Field a:Ljava/util/Set;
      49: aload_1
      50: iload_3
      51: invokevirtual #72                 // Method org/json/JSONArray.getInt:(I)I
      54: invokestatic  #78                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
      57: invokeinterface #84,  2           // InterfaceMethod java/util/Set.add:(Ljava/lang/Object;)Z
      62: pop
      63: iload_3
      64: iconst_1
      65: iadd
      66: istore_3
      67: goto          37
      70: return
      71: astore_1
      72: aload_1
      73: invokestatic  #89                 // Method com/google/a/a/a/a/a/a.a:(Ljava/lang/Throwable;)V
      76: new           #91                 // class ryey/easer/commons/local_plugin/b
      79: dup
      80: aload_1
      81: invokespecial #94                 // Method ryey/easer/commons/local_plugin/b."<init>":(Ljava/lang/Exception;)V
      84: athrow
    Exception table:
       from    to  target type
          26    35    71   Class org/json/JSONException
          37    63    71   Class org/json/JSONException

  ryey.easer.plugins.a.g.a(java.util.Set<java.lang.Integer>);
    Code:
       0: aload_0
       1: invokespecial #26                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: new           #28                 // class android/support/v4/g/b
       8: dup
       9: bipush        7
      11: invokespecial #31                 // Method android/support/v4/g/b."<init>":(I)V
      14: putfield      #33                 // Field a:Ljava/util/Set;
      17: aload_0
      18: aload_1
      19: putfield      #33                 // Field a:Ljava/util/Set;
      22: return

  public java.lang.String a(ryey.easer.b.a);
    Code:
       0: getstatic     #54                 // Field ryey/easer/plugins/a/g/a$2.a:[I
       3: aload_1
       4: invokevirtual #60                 // Method ryey/easer/b/a.ordinal:()I
       7: iaload
       8: istore_2
       9: new           #62                 // class org/json/JSONArray
      12: dup
      13: invokespecial #99                 // Method org/json/JSONArray."<init>":()V
      16: astore_1
      17: aload_0
      18: getfield      #33                 // Field a:Ljava/util/Set;
      21: invokeinterface #103,  1          // InterfaceMethod java/util/Set.iterator:()Ljava/util/Iterator;
      26: astore_3
      27: aload_3
      28: invokeinterface #109,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
      33: ifeq          53
      36: aload_1
      37: aload_3
      38: invokeinterface #113,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
      43: checkcast     #74                 // class java/lang/Integer
      46: invokevirtual #117                // Method org/json/JSONArray.put:(Ljava/lang/Object;)Lorg/json/JSONArray;
      49: pop
      50: goto          27
      53: aload_1
      54: invokevirtual #121                // Method org/json/JSONArray.toString:()Ljava/lang/String;
      57: areturn

  public boolean a();
    Code:
       0: aload_0
       1: getfield      #33                 // Field a:Ljava/util/Set;
       4: ifnonnull     9
       7: iconst_0
       8: ireturn
       9: aload_0
      10: getfield      #33                 // Field a:Ljava/util/Set;
      13: invokeinterface #124,  1          // InterfaceMethod java/util/Set.isEmpty:()Z
      18: ifeq          23
      21: iconst_0
      22: ireturn
      23: iconst_1
      24: ireturn

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
      12: instanceof    #2                  // class ryey/easer/plugins/a/g/a
      15: ifne          20
      18: iconst_0
      19: ireturn
      20: aload_0
      21: getfield      #33                 // Field a:Ljava/util/Set;
      24: aload_1
      25: checkcast     #2                  // class ryey/easer/plugins/a/g/a
      28: getfield      #33                 // Field a:Ljava/util/Set;
      31: invokeinterface #128,  2          // InterfaceMethod java/util/Set.equals:(Ljava/lang/Object;)Z
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
       1: new           #35                 // class java/util/ArrayList
       4: dup
       5: aload_0
       6: getfield      #33                 // Field a:Ljava/util/Set;
       9: invokespecial #131                // Method java/util/ArrayList."<init>":(Ljava/util/Collection;)V
      12: invokevirtual #135                // Method android/os/Parcel.writeList:(Ljava/util/List;)V
      15: return
}
