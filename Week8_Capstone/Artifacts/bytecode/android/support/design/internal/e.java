public class android.support.design.internal.e extends android.util.SparseArray<android.os.Parcelable> implements android.os.Parcelable {
  public static final android.os.Parcelable$Creator<android.support.design.internal.e> CREATOR;

  static {};
    Code:
       0: new           #9                  // class android/support/design/internal/e$1
       3: dup
       4: invokespecial #17                 // Method android/support/design/internal/e$1."<init>":()V
       7: putstatic     #19                 // Field CREATOR:Landroid/os/Parcelable$Creator;
      10: return

  public android.support.design.internal.e();
    Code:
       0: aload_0
       1: invokespecial #21                 // Method android/util/SparseArray."<init>":()V
       4: return

  public android.support.design.internal.e(android.os.Parcel, java.lang.ClassLoader);
    Code:
       0: aload_0
       1: invokespecial #21                 // Method android/util/SparseArray."<init>":()V
       4: aload_1
       5: invokevirtual #28                 // Method android/os/Parcel.readInt:()I
       8: istore        4
      10: iload         4
      12: newarray       int
      14: astore        5
      16: aload_1
      17: aload         5
      19: invokevirtual #32                 // Method android/os/Parcel.readIntArray:([I)V
      22: aload_1
      23: aload_2
      24: invokevirtual #36                 // Method android/os/Parcel.readParcelableArray:(Ljava/lang/ClassLoader;)[Landroid/os/Parcelable;
      27: astore_1
      28: iconst_0
      29: istore_3
      30: iload_3
      31: iload         4
      33: if_icmpge     54
      36: aload_0
      37: aload         5
      39: iload_3
      40: iaload
      41: aload_1
      42: iload_3
      43: aaload
      44: invokevirtual #40                 // Method put:(ILjava/lang/Object;)V
      47: iload_3
      48: iconst_1
      49: iadd
      50: istore_3
      51: goto          30
      54: return

  public int describeContents();
    Code:
       0: iconst_0
       1: ireturn

  public void writeToParcel(android.os.Parcel, int);
    Code:
       0: aload_0
       1: invokevirtual #46                 // Method size:()I
       4: istore        4
       6: iload         4
       8: newarray       int
      10: astore        5
      12: iload         4
      14: anewarray     #7                  // class android/os/Parcelable
      17: astore        6
      19: iconst_0
      20: istore_3
      21: iload_3
      22: iload         4
      24: if_icmpge     55
      27: aload         5
      29: iload_3
      30: aload_0
      31: iload_3
      32: invokevirtual #50                 // Method keyAt:(I)I
      35: iastore
      36: aload         6
      38: iload_3
      39: aload_0
      40: iload_3
      41: invokevirtual #54                 // Method valueAt:(I)Ljava/lang/Object;
      44: checkcast     #7                  // class android/os/Parcelable
      47: aastore
      48: iload_3
      49: iconst_1
      50: iadd
      51: istore_3
      52: goto          21
      55: aload_1
      56: iload         4
      58: invokevirtual #58                 // Method android/os/Parcel.writeInt:(I)V
      61: aload_1
      62: aload         5
      64: invokevirtual #61                 // Method android/os/Parcel.writeIntArray:([I)V
      67: aload_1
      68: aload         6
      70: iload_2
      71: invokevirtual #65                 // Method android/os/Parcel.writeParcelableArray:([Landroid/os/Parcelable;I)V
      74: return
}
