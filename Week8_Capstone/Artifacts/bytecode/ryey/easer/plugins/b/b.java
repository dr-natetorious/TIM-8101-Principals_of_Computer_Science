public class ryey.easer.plugins.b.b implements android.os.Parcelable {
  public static final android.os.Parcelable$Creator<ryey.easer.plugins.b.b> CREATOR;

  static {};
    Code:
       0: new           #8                  // class ryey/easer/plugins/b/b$1
       3: dup
       4: invokespecial #19                 // Method ryey/easer/plugins/b/b$1."<init>":()V
       7: putstatic     #21                 // Field CREATOR:Landroid/os/Parcelable$Creator;
      10: return

  public ryey.easer.plugins.b.b();
    Code:
       0: aload_0
       1: invokespecial #23                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: aconst_null
       6: putfield      #25                 // Field a:Ljava/lang/Integer;
       9: aload_0
      10: aconst_null
      11: putfield      #27                 // Field b:Ljava/lang/Integer;
      14: return

  public ryey.easer.plugins.b.b(int, int);
    Code:
       0: aload_0
       1: invokespecial #23                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: aconst_null
       6: putfield      #25                 // Field a:Ljava/lang/Integer;
       9: aload_0
      10: aconst_null
      11: putfield      #27                 // Field b:Ljava/lang/Integer;
      14: aload_0
      15: iload_1
      16: invokestatic  #34                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
      19: putfield      #25                 // Field a:Ljava/lang/Integer;
      22: aload_0
      23: iload_2
      24: invokestatic  #34                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
      27: putfield      #27                 // Field b:Ljava/lang/Integer;
      30: return

  ryey.easer.plugins.b.b(android.os.Parcel, ryey.easer.plugins.b.b$1);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #44                 // Method "<init>":(Landroid/os/Parcel;)V
       5: return

  public static ryey.easer.plugins.b.b a(android.telephony.CellInfo);
    Code:
       0: aload_0
       1: instanceof    #47                 // class android/telephony/CellInfoGsm
       4: ifeq          28
       7: aload_0
       8: checkcast     #47                 // class android/telephony/CellInfoGsm
      11: invokevirtual #51                 // Method android/telephony/CellInfoGsm.getCellIdentity:()Landroid/telephony/CellIdentityGsm;
      14: astore_0
      15: aload_0
      16: invokevirtual #56                 // Method android/telephony/CellIdentityGsm.getCid:()I
      19: istore_1
      20: aload_0
      21: invokevirtual #59                 // Method android/telephony/CellIdentityGsm.getLac:()I
      24: istore_2
      25: goto          89
      28: aload_0
      29: instanceof    #61                 // class android/telephony/CellInfoCdma
      32: ifeq          56
      35: aload_0
      36: checkcast     #61                 // class android/telephony/CellInfoCdma
      39: invokevirtual #64                 // Method android/telephony/CellInfoCdma.getCellIdentity:()Landroid/telephony/CellIdentityCdma;
      42: astore_0
      43: aload_0
      44: invokevirtual #69                 // Method android/telephony/CellIdentityCdma.getBasestationId:()I
      47: istore_1
      48: aload_0
      49: invokevirtual #72                 // Method android/telephony/CellIdentityCdma.getSystemId:()I
      52: istore_2
      53: goto          89
      56: getstatic     #78                 // Field android/os/Build$VERSION.SDK_INT:I
      59: bipush        18
      61: if_icmplt     99
      64: aload_0
      65: instanceof    #80                 // class android/telephony/CellInfoWcdma
      68: ifeq          99
      71: aload_0
      72: checkcast     #80                 // class android/telephony/CellInfoWcdma
      75: invokevirtual #83                 // Method android/telephony/CellInfoWcdma.getCellIdentity:()Landroid/telephony/CellIdentityWcdma;
      78: astore_0
      79: aload_0
      80: invokevirtual #86                 // Method android/telephony/CellIdentityWcdma.getCid:()I
      83: istore_1
      84: aload_0
      85: invokevirtual #87                 // Method android/telephony/CellIdentityWcdma.getLac:()I
      88: istore_2
      89: new           #2                  // class ryey/easer/plugins/b/b
      92: dup
      93: iload_1
      94: iload_2
      95: invokespecial #89                 // Method "<init>":(II)V
      98: areturn
      99: aconst_null
     100: areturn

  public static ryey.easer.plugins.b.b a(android.telephony.CellLocation);
    Code:
       0: aload_0
       1: ifnull        61
       4: aload_0
       5: instanceof    #92                 // class android/telephony/gsm/GsmCellLocation
       8: ifeq          29
      11: aload_0
      12: checkcast     #92                 // class android/telephony/gsm/GsmCellLocation
      15: astore_0
      16: aload_0
      17: invokevirtual #93                 // Method android/telephony/gsm/GsmCellLocation.getCid:()I
      20: istore_1
      21: aload_0
      22: invokevirtual #94                 // Method android/telephony/gsm/GsmCellLocation.getLac:()I
      25: istore_2
      26: goto          51
      29: aload_0
      30: instanceof    #96                 // class android/telephony/cdma/CdmaCellLocation
      33: ifeq          61
      36: aload_0
      37: checkcast     #96                 // class android/telephony/cdma/CdmaCellLocation
      40: astore_0
      41: aload_0
      42: invokevirtual #99                 // Method android/telephony/cdma/CdmaCellLocation.getBaseStationId:()I
      45: istore_1
      46: aload_0
      47: invokevirtual #100                // Method android/telephony/cdma/CdmaCellLocation.getSystemId:()I
      50: istore_2
      51: new           #2                  // class ryey/easer/plugins/b/b
      54: dup
      55: iload_1
      56: iload_2
      57: invokespecial #89                 // Method "<init>":(II)V
      60: areturn
      61: aconst_null
      62: areturn

  public void a(java.lang.Object);
    Code:
       0: aload_1
       1: instanceof    #119                // class java/util/List
       4: ifeq          56
       7: aload_1
       8: checkcast     #119                // class java/util/List
      11: astore_1
      12: aload_1
      13: invokeinterface #139,  1          // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
      18: astore_2
      19: aload_2
      20: invokeinterface #145,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
      25: ifeq          50
      28: aload_2
      29: invokeinterface #149,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
      34: instanceof    #30                 // class java/lang/Integer
      37: ifne          19
      40: new           #124                // class java/lang/RuntimeException
      43: dup
      44: ldc           #126                // String illegal data
      46: invokespecial #128                // Method java/lang/RuntimeException."<init>":(Ljava/lang/String;)V
      49: athrow
      50: aload_0
      51: aload_1
      52: invokespecial #151                // Method a:(Ljava/util/List;)V
      55: return
      56: aload_1
      57: instanceof    #105                // class java/lang/String
      60: ifeq          72
      63: aload_0
      64: aload_1
      65: checkcast     #105                // class java/lang/String
      68: invokespecial #153                // Method a:(Ljava/lang/String;)V
      71: return
      72: new           #124                // class java/lang/RuntimeException
      75: dup
      76: ldc           #126                // String illegal data
      78: invokespecial #128                // Method java/lang/RuntimeException."<init>":(Ljava/lang/String;)V
      81: athrow

  public boolean a();
    Code:
       0: aload_0
       1: getfield      #25                 // Field a:Ljava/lang/Integer;
       4: ifnull        19
       7: aload_0
       8: getfield      #27                 // Field b:Ljava/lang/Integer;
      11: ifnonnull     17
      14: goto          19
      17: iconst_1
      18: ireturn
      19: iconst_0
      20: ireturn

  public int describeContents();
    Code:
       0: iconst_0
       1: ireturn

  public boolean equals(java.lang.Object);
    Code:
       0: aload_0
       1: aload_1
       2: if_acmpne     7
       5: iconst_1
       6: ireturn
       7: aload_1
       8: ifnull        91
      11: aload_0
      12: invokevirtual #160                // Method java/lang/Object.getClass:()Ljava/lang/Class;
      15: aload_1
      16: invokevirtual #160                // Method java/lang/Object.getClass:()Ljava/lang/Class;
      19: if_acmpeq     24
      22: iconst_0
      23: ireturn
      24: aload_1
      25: checkcast     #2                  // class ryey/easer/plugins/b/b
      28: astore_1
      29: aload_0
      30: getfield      #25                 // Field a:Ljava/lang/Integer;
      33: ifnull        52
      36: aload_0
      37: getfield      #25                 // Field a:Ljava/lang/Integer;
      40: aload_1
      41: getfield      #25                 // Field a:Ljava/lang/Integer;
      44: invokevirtual #162                // Method java/lang/Integer.equals:(Ljava/lang/Object;)Z
      47: ifne          61
      50: iconst_0
      51: ireturn
      52: aload_1
      53: getfield      #25                 // Field a:Ljava/lang/Integer;
      56: ifnull        61
      59: iconst_0
      60: ireturn
      61: aload_0
      62: getfield      #27                 // Field b:Ljava/lang/Integer;
      65: ifnull        80
      68: aload_0
      69: getfield      #27                 // Field b:Ljava/lang/Integer;
      72: aload_1
      73: getfield      #27                 // Field b:Ljava/lang/Integer;
      76: invokevirtual #162                // Method java/lang/Integer.equals:(Ljava/lang/Object;)Z
      79: ireturn
      80: aload_1
      81: getfield      #27                 // Field b:Ljava/lang/Integer;
      84: ifnonnull     89
      87: iconst_1
      88: ireturn
      89: iconst_0
      90: ireturn
      91: iconst_0
      92: ireturn

  public int hashCode();
    Code:
       0: aload_0
       1: getfield      #25                 // Field a:Ljava/lang/Integer;
       4: astore_3
       5: iconst_0
       6: istore_2
       7: aload_3
       8: ifnull        22
      11: aload_0
      12: getfield      #25                 // Field a:Ljava/lang/Integer;
      15: invokevirtual #165                // Method java/lang/Integer.hashCode:()I
      18: istore_1
      19: goto          24
      22: iconst_0
      23: istore_1
      24: aload_0
      25: getfield      #27                 // Field b:Ljava/lang/Integer;
      28: ifnull        39
      31: aload_0
      32: getfield      #27                 // Field b:Ljava/lang/Integer;
      35: invokevirtual #165                // Method java/lang/Integer.hashCode:()I
      38: istore_2
      39: iload_1
      40: bipush        31
      42: imul
      43: iload_2
      44: iadd
      45: ireturn

  public java.lang.String toString();
    Code:
       0: getstatic     #172                // Field java/util/Locale.US:Ljava/util/Locale;
       3: ldc           #174                // String %d-%d
       5: iconst_2
       6: anewarray     #4                  // class java/lang/Object
       9: dup
      10: iconst_0
      11: aload_0
      12: getfield      #25                 // Field a:Ljava/lang/Integer;
      15: aastore
      16: dup
      17: iconst_1
      18: aload_0
      19: getfield      #27                 // Field b:Ljava/lang/Integer;
      22: aastore
      23: invokestatic  #178                // Method java/lang/String.format:(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      26: areturn

  public void writeToParcel(android.os.Parcel, int);
    Code:
       0: aload_1
       1: aload_0
       2: getfield      #25                 // Field a:Ljava/lang/Integer;
       5: invokevirtual #183                // Method java/lang/Integer.intValue:()I
       8: invokevirtual #187                // Method android/os/Parcel.writeInt:(I)V
      11: aload_1
      12: aload_0
      13: getfield      #27                 // Field b:Ljava/lang/Integer;
      16: invokevirtual #183                // Method java/lang/Integer.intValue:()I
      19: invokevirtual #187                // Method android/os/Parcel.writeInt:(I)V
      22: return
}
