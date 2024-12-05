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
      <a href="https://github.com/adoptium/temurin21-binaries/releases/download/jdk-21.0.5%2B11/OpenJDK21U-jre_x64_windows_hotspot_21.0.5_11.msi">x64</a>
    </td>
    <td>
      <a href="https://github.com/adoptium/temurin21-binaries/releases/download/jdk-21.0.5%2B11/OpenJDK21U-jre_aarch64_windows_hotspot_21.0.5_11.msi">aarch64 (ARM)</a>
    </td>
  </tr>
  <tr>
    <td>
      <img src="https://raw.githubusercontent.com/tandpfun/skill-icons/refs/heads/main/icons/Apple-Dark.svg" height="30px" width="30px"></img>
    </td>
    <td>
      <a href="https://github.com/adoptium/temurin21-binaries/releases/download/jdk-21.0.5%2B11/OpenJDK21U-jre_aarch64_mac_hotspot_21.0.5_11.pkg">aarch64 (ARM)</a>
    </td>
    <td>
      <a href="https://github.com/adoptium/temurin21-binaries/releases/download/jdk-21.0.5%2B11/OpenJDK21U-jre_x64_mac_hotspot_21.0.5_11.pkg">x64</a>
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
