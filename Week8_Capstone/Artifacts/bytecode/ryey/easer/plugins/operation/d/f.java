public class ryey.easer.plugins.operation.d.f implements android.os.Parcelable {
  public static final android.os.Parcelable$Creator<ryey.easer.plugins.operation.d.f> CREATOR;

  java.lang.String a;

  java.util.List<java.lang.String> b;

  java.lang.String c;

  android.net.Uri d;

  java.util.List<ryey.easer.plugins.operation.d.f$a> e;

  static {};
    Code:
       0: new           #8                  // class ryey/easer/plugins/operation/d/f$1
       3: dup
       4: invokespecial #30                 // Method ryey/easer/plugins/operation/d/f$1."<init>":()V
       7: putstatic     #32                 // Field CREATOR:Landroid/os/Parcelable$Creator;
      10: return

  ryey.easer.plugins.operation.d.f();
    Code:
       0: aload_0
       1: invokespecial #34                 // Method java/lang/Object."<init>":()V
       4: return

  ryey.easer.plugins.operation.d.f(android.os.Parcel, ryey.easer.plugins.operation.d.f$1);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #84                 // Method "<init>":(Landroid/os/Parcel;)V
       5: return

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
       8: instanceof    #2                  // class ryey/easer/plugins/operation/d/f
      11: ifne          16
      14: iconst_0
      15: ireturn
      16: aload_0
      17: getfield      #43                 // Field a:Ljava/lang/String;
      20: astore_2
      21: aload_1
      22: checkcast     #2                  // class ryey/easer/plugins/operation/d/f
      25: astore_1
      26: aload_2
      27: aload_1
      28: getfield      #43                 // Field a:Ljava/lang/String;
      31: invokestatic  #92                 // Method ryey/easer/b.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
      34: ifne          39
      37: iconst_0
      38: ireturn
      39: aload_0
      40: getfield      #58                 // Field b:Ljava/util/List;
      43: aload_1
      44: getfield      #58                 // Field b:Ljava/util/List;
      47: invokestatic  #92                 // Method ryey/easer/b.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
      50: ifne          55
      53: iconst_0
      54: ireturn
      55: aload_0
      56: getfield      #60                 // Field c:Ljava/lang/String;
      59: aload_1
      60: getfield      #60                 // Field c:Ljava/lang/String;
      63: invokestatic  #92                 // Method ryey/easer/b.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
      66: ifne          71
      69: iconst_0
      70: ireturn
      71: aload_0
      72: getfield      #74                 // Field d:Landroid/net/Uri;
      75: aload_1
      76: getfield      #74                 // Field d:Landroid/net/Uri;
      79: invokestatic  #92                 // Method ryey/easer/b.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
      82: ifne          87
      85: iconst_0
      86: ireturn
      87: aload_0
      88: getfield      #81                 // Field e:Ljava/util/List;
      91: aload_1
      92: getfield      #81                 // Field e:Ljava/util/List;
      95: invokestatic  #92                 // Method ryey/easer/b.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
      98: ifne          103
     101: iconst_0
     102: ireturn
     103: iconst_1
     104: ireturn

  public java.lang.String toString();
    Code:
       0: ldc           #95                 // String action:%s category:%s type:%s data:%s
       2: iconst_4
       3: anewarray     #4                  // class java/lang/Object
       6: dup
       7: iconst_0
       8: aload_0
       9: getfield      #43                 // Field a:Ljava/lang/String;
      12: aastore
      13: dup
      14: iconst_1
      15: aload_0
      16: getfield      #58                 // Field b:Ljava/util/List;
      19: aastore
      20: dup
      21: iconst_2
      22: aload_0
      23: getfield      #60                 // Field c:Ljava/lang/String;
      26: aastore
      27: dup
      28: iconst_3
      29: aload_0
      30: getfield      #74                 // Field d:Landroid/net/Uri;
      33: aastore
      34: invokestatic  #101                // Method java/lang/String.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      37: areturn

  public void writeToParcel(android.os.Parcel, int);
    Code:
       0: aload_1
       1: aload_0
       2: getfield      #43                 // Field a:Ljava/lang/String;
       5: invokevirtual #107                // Method android/os/Parcel.writeString:(Ljava/lang/String;)V
       8: aload_1
       9: aload_0
      10: getfield      #58                 // Field b:Ljava/util/List;
      13: invokevirtual #110                // Method android/os/Parcel.writeStringList:(Ljava/util/List;)V
      16: aload_1
      17: aload_0
      18: getfield      #60                 // Field c:Ljava/lang/String;
      21: invokevirtual #107                // Method android/os/Parcel.writeString:(Ljava/lang/String;)V
      24: aload_1
      25: aload_0
      26: getfield      #74                 // Field d:Landroid/net/Uri;
      29: iconst_0
      30: invokevirtual #114                // Method android/os/Parcel.writeParcelable:(Landroid/os/Parcelable;I)V
      33: aload_1
      34: aload_0
      35: getfield      #81                 // Field e:Ljava/util/List;
      38: invokevirtual #117                // Method android/os/Parcel.writeTypedList:(Ljava/util/List;)V
      41: return
}
