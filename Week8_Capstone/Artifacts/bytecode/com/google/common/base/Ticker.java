public abstract class com.google.common.base.Ticker {
  static {};
    Code:
       0: new           #6                  // class com/google/common/base/Ticker$1
       3: dup
       4: invokespecial #13                 // Method com/google/common/base/Ticker$1."<init>":()V
       7: putstatic     #15                 // Field SYSTEM_TICKER:Lcom/google/common/base/Ticker;
      10: return

  protected com.google.common.base.Ticker();
    Code:
       0: aload_0
       1: invokespecial #17                 // Method java/lang/Object."<init>":()V
       4: return

  public static com.google.common.base.Ticker systemTicker();
    Code:
       0: getstatic     #15                 // Field SYSTEM_TICKER:Lcom/google/common/base/Ticker;
       3: areturn

  public abstract long read();
}
