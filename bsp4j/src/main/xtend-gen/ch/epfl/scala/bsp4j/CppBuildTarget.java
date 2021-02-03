package ch.epfl.scala.bsp4j;

import ch.epfl.scala.bsp4j.CppPlatform;
import org.eclipse.lsp4j.jsonrpc.validation.NonNull;
import org.eclipse.lsp4j.util.Preconditions;
import org.eclipse.xtext.xbase.lib.Pure;
import org.eclipse.xtext.xbase.lib.util.ToStringBuilder;

@SuppressWarnings("all")
public class CppBuildTarget {
  @NonNull
  private CppPlatform platform;
  
  private String cCompiler;
  
  private String cppCompiler;
  
  public CppBuildTarget(@NonNull final CppPlatform platform, final String cCompiler, final String cppCompiler) {
    this.platform = platform;
    this.cCompiler = cCompiler;
    this.cppCompiler = cppCompiler;
  }
  
  @Pure
  @NonNull
  public CppPlatform getPlatform() {
    return this.platform;
  }
  
  public void setPlatform(@NonNull final CppPlatform platform) {
    this.platform = Preconditions.checkNotNull(platform, "platform");
  }
  
  @Pure
  public String getCCompiler() {
    return this.cCompiler;
  }
  
  public void setCCompiler(final String cCompiler) {
    this.cCompiler = cCompiler;
  }
  
  @Pure
  public String getCppCompiler() {
    return this.cppCompiler;
  }
  
  public void setCppCompiler(final String cppCompiler) {
    this.cppCompiler = cppCompiler;
  }
  
  @Override
  @Pure
  public String toString() {
    ToStringBuilder b = new ToStringBuilder(this);
    b.add("platform", this.platform);
    b.add("cCompiler", this.cCompiler);
    b.add("cppCompiler", this.cppCompiler);
    return b.toString();
  }
  
  @Override
  @Pure
  public boolean equals(final Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    CppBuildTarget other = (CppBuildTarget) obj;
    if (this.platform == null) {
      if (other.platform != null)
        return false;
    } else if (!this.platform.equals(other.platform))
      return false;
    if (this.cCompiler == null) {
      if (other.cCompiler != null)
        return false;
    } else if (!this.cCompiler.equals(other.cCompiler))
      return false;
    if (this.cppCompiler == null) {
      if (other.cppCompiler != null)
        return false;
    } else if (!this.cppCompiler.equals(other.cppCompiler))
      return false;
    return true;
  }
  
  @Override
  @Pure
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((this.platform== null) ? 0 : this.platform.hashCode());
    result = prime * result + ((this.cCompiler== null) ? 0 : this.cCompiler.hashCode());
    return prime * result + ((this.cppCompiler== null) ? 0 : this.cppCompiler.hashCode());
  }
}
