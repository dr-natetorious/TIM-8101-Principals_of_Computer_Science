class android.databinding.ViewDataBinding$d<T> extends java.lang.ref.WeakReference<android.databinding.ViewDataBinding> {
  public boolean a();
    Code:
       0: aload_0
       1: getfield      #17                 // Field b:Ljava/lang/Object;
       4: ifnull        25
       7: aload_0
       8: getfield      #19                 // Field a:Landroid/databinding/ViewDataBinding$c;
      11: aload_0
      12: getfield      #17                 // Field b:Ljava/lang/Object;
      15: invokeinterface #24,  2           // InterfaceMethod android/databinding/ViewDataBinding$c.a:(Ljava/lang/Object;)V
      20: iconst_1
      21: istore_1
      22: goto          27
      25: iconst_0
      26: istore_1
      27: aload_0
      28: aconst_null
      29: putfield      #17                 // Field b:Ljava/lang/Object;
      32: iload_1
      33: ireturn
}
