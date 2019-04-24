public class android.support.design.widget.CoordinatorLayout$g extends android.support.v4.view.a {
  public static final android.os.Parcelable$Creator<android.support.design.widget.CoordinatorLayout$g> CREATOR;

  android.util.SparseArray<android.os.Parcelable> a;

  static {};
    Code:
       0: new           #9                  // class android/support/design/widget/CoordinatorLayout$g$1
       3: dup
       4: invokespecial #20                 // Method android/support/design/widget/CoordinatorLayout$g$1."<init>":()V
       7: putstatic     #22                 // Field CREATOR:Landroid/os/Parcelable$Creator;
      10: return

  public android.support.design.widget.CoordinatorLayout$g(android.os.Parcel, java.lang.ClassLoader);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: invokespecial #26                 // Method android/support/v4/view/a."<init>":(Landroid/os/Parcel;Ljava/lang/ClassLoader;)V
       6: aload_1
       7: invokevirtual #32                 // Method android/os/Parcel.readInt:()I
      10: istore        4
      12: iload         4
      14: newarray       int
      16: astore        5
      18: aload_1
      19: aload         5
      21: invokevirtual #36                 // Method android/os/Parcel.readIntArray:([I)V
      24: aload_1
      25: aload_2
      26: invokevirtual #40                 // Method android/os/Parcel.readParcelableArray:(Ljava/lang/ClassLoader;)[Landroid/os/Parcelable;
      29: astore_1
      30: aload_0
      31: new           #42                 // class android/util/SparseArray
      34: dup
      35: iload         4
      37: invokespecial #45                 // Method android/util/SparseArray."<init>":(I)V
      40: putfield      #47                 // Field a:Landroid/util/SparseArray;
      43: iconst_0
      44: istore_3
      45: iload_3
      46: iload         4
      48: if_icmpge     72
      51: aload_0
      52: getfield      #47                 // Field a:Landroid/util/SparseArray;
      55: aload         5
      57: iload_3
      58: iaload
      59: aload_1
      60: iload_3
      61: aaload
      62: invokevirtual #51                 // Method android/util/SparseArray.append:(ILjava/lang/Object;)V
      65: iload_3
      66: iconst_1
      67: iadd
      68: istore_3
      69: goto          45
      72: return

  public android.support.design.widget.CoordinatorLayout$g(android.os.Parcelable);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #54                 // Method android/support/v4/view/a."<init>":(Landroid/os/Parcelable;)V
       5: return

  public void writeToParcel(android.os.Parcel, int);
    Code:
       0: aload_0
       1: aload_1
       2: iload_2
       3: invokespecial #58                 // Method android/support/v4/view/a.writeToParcel:(Landroid/os/Parcel;I)V
       6: aload_0
       7: getfield      #47                 // Field a:Landroid/util/SparseArray;
      10: astore        5
      12: iconst_0
      13: istore        4
      15: aload         5
      17: ifnull        31
      20: aload_0
      21: getfield      #47                 // Field a:Landroid/util/SparseArray;
      24: invokevirtual #61                 // Method android/util/SparseArray.size:()I
      27: istore_3
      28: goto          33
      31: iconst_0
      32: istore_3
      33: aload_1
      34: iload_3
      35: invokevirtual #64                 // Method android/os/Parcel.writeInt:(I)V
      38: iload_3
      39: newarray       int
      41: astore        5
      43: iload_3
      44: anewarray     #66                 // class android/os/Parcelable
      47: astore        6
      49: iload         4
      51: iload_3
      52: if_icmpge     95
      55: aload         5
      57: iload         4
      59: aload_0
      60: getfield      #47                 // Field a:Landroid/util/SparseArray;
      63: iload         4
      65: invokevirtual #70                 // Method android/util/SparseArray.keyAt:(I)I
      68: iastore
      69: aload         6
      71: iload         4
      73: aload_0
      74: getfield      #47                 // Field a:Landroid/util/SparseArray;
      77: iload         4
      79: invokevirtual #74                 // Method android/util/SparseArray.valueAt:(I)Ljava/lang/Object;
      82: checkcast     #66                 // class android/os/Parcelable
      85: aastore
      86: iload         4
      88: iconst_1
      89: iadd
      90: istore        4
      92: goto          49
      95: aload_1
      96: aload         5
      98: invokevirtual #77                 // Method android/os/Parcel.writeIntArray:([I)V
     101: aload_1
     102: aload         6
     104: iload_2
     105: invokevirtual #81                 // Method android/os/Parcel.writeParcelableArray:([Landroid/os/Parcelable;I)V
     108: return
}
