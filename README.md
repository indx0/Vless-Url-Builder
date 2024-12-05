# Amnezia Vless URL Builder
A utility for converting Amnezia XRay JSON to `vless://` format URLs.

## Installation
Ensure that Java 21 or higher is installed before running this utility.

### JRE Download Links

<table style="width: 100%; border: none;" cellspacing="0" cellpadding="0" border="0">
  <tr>
    <td>
      <img src="https://raw.githubusercontent.com/tandpfun/skill-icons/refs/heads/main/icons/Windows-Dark.svg" height="30px" width="30px"></img>
    </td>
  <td>
      <a href="https://objects.githubusercontent.com/github-production-release-asset-2e65be/602574963/17b3c72c-9fdd-4267-8441-1b1a1ef41b8e?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Credential=releaseassetproduction%2F20241205%2Fus-east-1%2Fs3%2Faws4_request&X-Amz-Date=20241205T125540Z&X-Amz-Expires=300&X-Amz-Signature=24f4efda84f63860d199b00eb3b8eccb03172f1627c92c2d9872bae179e11ea4&X-Amz-SignedHeaders=host&response-content-disposition=attachment%3B%20filename%3DOpenJDK21U-jre_x64_windows_hotspot_21.0.5_11.msi&response-content-type=application%2Foctet-stream">x64</a>
    </td>
    <td>
      <a href="https://objects.githubusercontent.com/github-production-release-asset-2e65be/602574963/2f09e3b5-7952-4970-ad80-42e0fdd2a6a8?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Credential=releaseassetproduction%2F20241205%2Fus-east-1%2Fs3%2Faws4_request&X-Amz-Date=20241205T125505Z&X-Amz-Expires=300&X-Amz-Signature=fcdc7a90c5945d480907e0befed5a9488ed5ccaa07d7396f566111287b107bb2&X-Amz-SignedHeaders=host&response-content-disposition=attachment%3B%20filename%3DOpenJDK21U-jre_aarch64_windows_hotspot_21.0.5_11.msi&response-content-type=application%2Foctet-stream">aarch64</a>
    </td>
  </tr>
  <tr>
    <td>
      <img src="https://raw.githubusercontent.com/tandpfun/skill-icons/refs/heads/main/icons/Apple-Dark.svg" height="30px" width="30px"></img>
    </td>
  <td>
      <a href="https://objects.githubusercontent.com/github-production-release-asset-2e65be/602574963/db86e8b9-4533-4c2f-90eb-322db5728685?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Credential=releaseassetproduction%2F20241205%2Fus-east-1%2Fs3%2Faws4_request&X-Amz-Date=20241205T125923Z&X-Amz-Expires=300&X-Amz-Signature=65f5894de5a73c91ce705f2465e27a311b2d34928c0cdc47817a1e34a447d6e2&X-Amz-SignedHeaders=host&response-content-disposition=attachment%3B%20filename%3DOpenJDK21U-jre_x64_mac_hotspot_21.0.5_11.pkg&response-content-type=application%2Foctet-stream">x64</a>
    </td>
    <td>
      <a href="https://objects.githubusercontent.com/github-production-release-asset-2e65be/602574963/59e38ca7-9769-4ef4-8f97-5728ad1ed87b?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Credential=releaseassetproduction%2F20241205%2Fus-east-1%2Fs3%2Faws4_request&X-Amz-Date=20241205T125905Z&X-Amz-Expires=300&X-Amz-Signature=0515a92b2766f4cdf5190aef983125aef863622a63ba5adccdc5b32010ae4b50&X-Amz-SignedHeaders=host&response-content-disposition=attachment%3B%20filename%3DOpenJDK21U-jre_aarch64_mac_hotspot_21.0.5_11.pkg&response-content-type=application%2Foctet-stream">aarch64</a>
    </td>
  </tr>
  <tr>
    <td>
      <img src="https://raw.githubusercontent.com/tandpfun/skill-icons/refs/heads/main/icons/Linux-Dark.svg" height="30px" width="30px"></img>
    </td>
    <td colspan=2>Install using your distro's package manager</td>
  </tr>
</table>

## Usage
```
java -jar ./Vless-Url-Builder.jar /path/to/file.json
```
Replace /path/to/file.json with the path to your XRay JSON file.
