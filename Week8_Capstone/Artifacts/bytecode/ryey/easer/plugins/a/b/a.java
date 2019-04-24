public class ryey.easer.plugins.a.b.a implements ryey.easer.commons.local_plugin.a.a {
  public static final android.os.Parcelable$Creator<ryey.easer.plugins.a.b.a> CREATOR;

  final java.util.List<java.lang.String> a;

  static {};
    Code:
       0: new           #8                  // class ryey/easer/plugins/a/b/a$1
       3: dup
       4: invokespecial #21                 // Method ryey/easer/plugins/a/b/a$1."<init>":()V
       7: putstatic     #23                 // Field CREATOR:Landroid/os/Parcelable$Creator;
      10: return

  ryey.easer.plugins.a.b.a(android.os.Parcel, ryey.easer.plugins.a.b.a$1);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #40                 // Method "<init>":(Landroid/os/Parcel;)V
       5: return

  ryey.easer.plugins.a.b.a(java.lang.String, ryey.easer.b.a, int);
    Code:
       0: aload_0
       1: invokespecial #26                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: new           #28                 // class java/util/ArrayList
       8: dup
       9: invokespecial #29                 // Method java/util/ArrayList."<init>":()V
      12: putfield      #31                 // Field a:Ljava/util/List;
      15: getstatic     #46                 // Field ryey/easer/plugins/a/b/a$2.a:[I
      18: aload_2
      19: invokevirtual #52                 // Method ryey/easer/b/a.ordinal:()I
      22: iaload
      23: istore_3
      24: aload_0
      25: getfield      #31                 // Field a:Ljava/util/List;
      28: invokeinterface #57,  1           // InterfaceMethod java/util/List.clear:()V
      33: getstatic     #46                 // Field ryey/easer/plugins/a/b/a$2.a:[I
      36: aload_2
      37: invokevirtual #52                 // Method ryey/easer/b/a.ordinal:()I
      40: iaload
      41: istore_3
      42: new           #59                 // class org/json/JSONArray
      45: dup
      46: aload_1
      47: invokespecial #62                 // Method org/json/JSONArray."<init>":(Ljava/lang/String;)V
      50: astore_1
      51: iconst_0
      52: istore_3
      53: iload_3
      54: aload_1
      55: invokevirtual #65                 // Method org/json/JSONArray.length:()I
      58: if_icmpge     85
      61: aload_1
      62: iload_3
      63: invokevirtual #69                 // Method org/json/JSONArray.getString:(I)Ljava/lang/String;
      66: astore_2
      67: aload_0
      68: getfield      #31                 // Field a:Ljava/util/List;
      71: aload_2
      72: invokeinterface #73,  2           // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
      77: pop
      78: iload_3
      79: iconst_1
      80: iadd
      81: istore_3
      82: goto          53
      85: return
      86: astore_1
      87: aload_1
      88: invokestatic  #78                 // Method com/google/a/a/a/a/a/a.a:(Ljava/lang/Throwable;)V
      91: new           #80                 // class ryey/easer/commons/local_plugin/b
      94: dup
      95: aload_1
      96: invokespecial #83                 // Method ryey/easer/commons/local_plugin/b."<init>":(Ljava/lang/Exception;)V
      99: athrow
    Exception table:
       from    to  target type
          42    51    86   Class org/json/JSONException
          53    78    86   Class org/json/JSONException

  ryey.easer.plugins.a.b.a(java.lang.String[]);
    Code:
       0: aload_0
       1: invokespecial #26                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: new           #28                 // class java/util/ArrayList
       8: dup
       9: invokespecial #29                 // Method java/util/ArrayList."<init>":()V
      12: putfield      #31                 // Field a:Ljava/util/List;
      15: aload_0
      16: aload_1
      17: invokespecial #86                 // Method a:([Ljava/lang/String;)V
      20: return

  public java.lang.String a(ryey.easer.b.a);
    Code:
       0: getstatic     #46                 // Field ryey/easer/plugins/a/b/a$2.a:[I
       3: aload_1
       4: invokevirtual #52                 // Method ryey/easer/b/a.ordinal:()I
       7: iaload
       8: istore_2
       9: new           #59                 // class org/json/JSONArray
      12: dup
      13: invokespecial #99                 // Method org/json/JSONArray."<init>":()V
      16: astore_1
      17: aload_0
      18: getfield      #31                 // Field a:Ljava/util/List;
      21: invokeinterface #103,  1          // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
      26: astore_3
      27: aload_3
      28: invokeinterface #109,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
      33: ifeq          53
      36: aload_1
      37: aload_3
      38: invokeinterface #113,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
      43: checkcast     #93                 // class java/lang/String
      46: invokevirtual #117                // Method org/json/JSONArray.put:(Ljava/lang/Object;)Lorg/json/JSONArray;
      49: pop
      50: goto          27
      53: aload_1
      54: invokevirtual #120                // Method org/json/JSONArray.toString:()Ljava/lang/String;
      57: areturn

  public boolean a();
    Code:
       0: aload_0
       1: getfield      #31                 // Field a:Ljava/util/List;
       4: invokeinterface #123,  1          // InterfaceMethod java/util/List.size:()I
       9: ifne          14
      12: iconst_0
      13: ireturn
      14: iconst_1
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
      12: instanceof    #2                  // class ryey/easer/plugins/a/b/a
      15: ifne          20
      18: iconst_0
      19: ireturn
      20: aload_0
      21: getfield      #31                 // Field a:Ljava/util/List;
      24: aload_1
      25: checkcast     #2                  // class ryey/easer/plugins/a/b/a
      28: getfield      #31                 // Field a:Ljava/util/List;
      31: invokeinterface #127,  2          // InterfaceMethod java/util/List.equals:(Ljava/lang/Object;)Z
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
       1: aload_0
       2: getfield      #31                 // Field a:Ljava/util/List;
       5: invokevirtual #132                // Method android/os/Parcel.writeStringList:(Ljava/util/List;)V
       8: return
}
