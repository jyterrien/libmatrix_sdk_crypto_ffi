package uniffi.matrix_sdk_crypto_ffi;


final class NamespaceLibrary {
    static synchronized String findLibraryName(String componentName) {
        String libOverride = System.getProperty("uniffi.component." + componentName + ".libraryOverride");
        if (libOverride != null) {
            return libOverride;
        }
        return "matrix_sdk_crypto_ffi";
    }

    static java.lang.foreign.SymbolLookup loadLibrary() {
        String name = findLibraryName("matrix_sdk_crypto_ffi");
        if (name.startsWith("/") // Unix absolute path
                || name.startsWith("\\\\") // Windows UNC path
                || (name.length() > 2 && name.charAt(1) == ':')) // Windows drive path (e.g. C:\)
        {
            System.load(name);
        } else {
            System.loadLibrary(name);
        }
        return java.lang.foreign.SymbolLookup.loaderLookup();
    }

    static void uniffiCheckContractApiVersion() {
        int bindingsContractVersion = 30;
        int scaffoldingContractVersion = UniffiLib.ffi_matrix_sdk_crypto_ffi_uniffi_contract_version();
        if (bindingsContractVersion != scaffoldingContractVersion) {
            throw new RuntimeException("UniFFI contract version mismatch: try cleaning and rebuilding your project");
        }
    }
    static void uniffiCheckApiChecksums() {
        if (UniffiLib.uniffi_matrix_sdk_crypto_ffi_checksum_func_migrate() != ((short) 54606)) {
            throw new RuntimeException("UniFFI API checksum mismatch: try cleaning and rebuilding your project");
        }
        if (UniffiLib.uniffi_matrix_sdk_crypto_ffi_checksum_func_migrate_room_settings() != ((short) 16773)) {
            throw new RuntimeException("UniFFI API checksum mismatch: try cleaning and rebuilding your project");
        }
        if (UniffiLib.uniffi_matrix_sdk_crypto_ffi_checksum_func_migrate_sessions() != ((short) 64327)) {
            throw new RuntimeException("UniFFI API checksum mismatch: try cleaning and rebuilding your project");
        }
        if (UniffiLib.uniffi_matrix_sdk_crypto_ffi_checksum_func_version() != ((short) 26089)) {
            throw new RuntimeException("UniFFI API checksum mismatch: try cleaning and rebuilding your project");
        }
        if (UniffiLib.uniffi_matrix_sdk_crypto_ffi_checksum_func_version_info() != ((short) 14100)) {
            throw new RuntimeException("UniFFI API checksum mismatch: try cleaning and rebuilding your project");
        }
        if (UniffiLib.uniffi_matrix_sdk_crypto_ffi_checksum_func_vodozemac_version() != ((short) 16893)) {
            throw new RuntimeException("UniFFI API checksum mismatch: try cleaning and rebuilding your project");
        }
        if (UniffiLib.uniffi_matrix_sdk_crypto_ffi_checksum_func_set_logger() != ((short) 35850)) {
            throw new RuntimeException("UniFFI API checksum mismatch: try cleaning and rebuilding your project");
        }
        if (UniffiLib.uniffi_matrix_sdk_crypto_ffi_checksum_method_backupkeys_backup_version() != ((short) 12001)) {
            throw new RuntimeException("UniFFI API checksum mismatch: try cleaning and rebuilding your project");
        }
        if (UniffiLib.uniffi_matrix_sdk_crypto_ffi_checksum_method_backupkeys_recovery_key() != ((short) 65466)) {
            throw new RuntimeException("UniFFI API checksum mismatch: try cleaning and rebuilding your project");
        }
        if (UniffiLib.uniffi_matrix_sdk_crypto_ffi_checksum_method_pkencryption_encrypt() != ((short) 49739)) {
            throw new RuntimeException("UniFFI API checksum mismatch: try cleaning and rebuilding your project");
        }
        if (UniffiLib.uniffi_matrix_sdk_crypto_ffi_checksum_method_backuprecoverykey_decrypt_v1() != ((short) 26145)) {
            throw new RuntimeException("UniFFI API checksum mismatch: try cleaning and rebuilding your project");
        }
        if (UniffiLib.uniffi_matrix_sdk_crypto_ffi_checksum_method_backuprecoverykey_megolm_v1_public_key() != ((short) 51549)) {
            throw new RuntimeException("UniFFI API checksum mismatch: try cleaning and rebuilding your project");
        }
        if (UniffiLib.uniffi_matrix_sdk_crypto_ffi_checksum_method_backuprecoverykey_to_base58() != ((short) 29456)) {
            throw new RuntimeException("UniFFI API checksum mismatch: try cleaning and rebuilding your project");
        }
        if (UniffiLib.uniffi_matrix_sdk_crypto_ffi_checksum_method_backuprecoverykey_to_base64() != ((short) 42499)) {
            throw new RuntimeException("UniFFI API checksum mismatch: try cleaning and rebuilding your project");
        }
        if (UniffiLib.uniffi_matrix_sdk_crypto_ffi_checksum_method_dehydrateddevice_keys_for_upload() != ((short) 8050)) {
            throw new RuntimeException("UniFFI API checksum mismatch: try cleaning and rebuilding your project");
        }
        if (UniffiLib.uniffi_matrix_sdk_crypto_ffi_checksum_method_dehydrateddevices_create() != ((short) 41743)) {
            throw new RuntimeException("UniFFI API checksum mismatch: try cleaning and rebuilding your project");
        }
        if (UniffiLib.uniffi_matrix_sdk_crypto_ffi_checksum_method_dehydrateddevices_delete_dehydrated_device_key() != ((short) 8316)) {
            throw new RuntimeException("UniFFI API checksum mismatch: try cleaning and rebuilding your project");
        }
        if (UniffiLib.uniffi_matrix_sdk_crypto_ffi_checksum_method_dehydrateddevices_get_dehydrated_device_key() != ((short) 20713)) {
            throw new RuntimeException("UniFFI API checksum mismatch: try cleaning and rebuilding your project");
        }
        if (UniffiLib.uniffi_matrix_sdk_crypto_ffi_checksum_method_dehydrateddevices_rehydrate() != ((short) 23862)) {
            throw new RuntimeException("UniFFI API checksum mismatch: try cleaning and rebuilding your project");
        }
        if (UniffiLib.uniffi_matrix_sdk_crypto_ffi_checksum_method_dehydrateddevices_save_dehydrated_device_key() != ((short) 27102)) {
            throw new RuntimeException("UniFFI API checksum mismatch: try cleaning and rebuilding your project");
        }
        if (UniffiLib.uniffi_matrix_sdk_crypto_ffi_checksum_method_rehydrateddevice_receive_events() != ((short) 50241)) {
            throw new RuntimeException("UniFFI API checksum mismatch: try cleaning and rebuilding your project");
        }
        if (UniffiLib.uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_backup_enabled() != ((short) 52874)) {
            throw new RuntimeException("UniFFI API checksum mismatch: try cleaning and rebuilding your project");
        }
        if (UniffiLib.uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_backup_room_keys() != ((short) 55312)) {
            throw new RuntimeException("UniFFI API checksum mismatch: try cleaning and rebuilding your project");
        }
        if (UniffiLib.uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_bootstrap_cross_signing() != ((short) 8390)) {
            throw new RuntimeException("UniFFI API checksum mismatch: try cleaning and rebuilding your project");
        }
        if (UniffiLib.uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_create_encrypted_to_device_request() != ((short) 15285)) {
            throw new RuntimeException("UniFFI API checksum mismatch: try cleaning and rebuilding your project");
        }
        if (UniffiLib.uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_cross_signing_status() != ((short) 32660)) {
            throw new RuntimeException("UniFFI API checksum mismatch: try cleaning and rebuilding your project");
        }
        if (UniffiLib.uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_decrypt_room_event() != ((short) 42655)) {
            throw new RuntimeException("UniFFI API checksum mismatch: try cleaning and rebuilding your project");
        }
        if (UniffiLib.uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_dehydrated_devices() != ((short) 56877)) {
            throw new RuntimeException("UniFFI API checksum mismatch: try cleaning and rebuilding your project");
        }
        if (UniffiLib.uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_device_id() != ((short) 10934)) {
            throw new RuntimeException("UniFFI API checksum mismatch: try cleaning and rebuilding your project");
        }
        if (UniffiLib.uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_disable_backup() != ((short) 54184)) {
            throw new RuntimeException("UniFFI API checksum mismatch: try cleaning and rebuilding your project");
        }
        if (UniffiLib.uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_discard_room_key() != ((short) 48579)) {
            throw new RuntimeException("UniFFI API checksum mismatch: try cleaning and rebuilding your project");
        }
        if (UniffiLib.uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_enable_backup_v1() != ((short) 56580)) {
            throw new RuntimeException("UniFFI API checksum mismatch: try cleaning and rebuilding your project");
        }
        if (UniffiLib.uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_encrypt() != ((short) 5157)) {
            throw new RuntimeException("UniFFI API checksum mismatch: try cleaning and rebuilding your project");
        }
        if (UniffiLib.uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_export_cross_signing_keys() != ((short) 55474)) {
            throw new RuntimeException("UniFFI API checksum mismatch: try cleaning and rebuilding your project");
        }
        if (UniffiLib.uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_export_room_keys() != ((short) 50078)) {
            throw new RuntimeException("UniFFI API checksum mismatch: try cleaning and rebuilding your project");
        }
        if (UniffiLib.uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_export_secrets_bundle() != ((short) 15994)) {
            throw new RuntimeException("UniFFI API checksum mismatch: try cleaning and rebuilding your project");
        }
        if (UniffiLib.uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_get_backup_keys() != ((short) 24623)) {
            throw new RuntimeException("UniFFI API checksum mismatch: try cleaning and rebuilding your project");
        }
        if (UniffiLib.uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_get_device() != ((short) 5928)) {
            throw new RuntimeException("UniFFI API checksum mismatch: try cleaning and rebuilding your project");
        }
        if (UniffiLib.uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_get_identity() != ((short) 39954)) {
            throw new RuntimeException("UniFFI API checksum mismatch: try cleaning and rebuilding your project");
        }
        if (UniffiLib.uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_get_missing_sessions() != ((short) 10527)) {
            throw new RuntimeException("UniFFI API checksum mismatch: try cleaning and rebuilding your project");
        }
        if (UniffiLib.uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_get_only_allow_trusted_devices() != ((short) 29503)) {
            throw new RuntimeException("UniFFI API checksum mismatch: try cleaning and rebuilding your project");
        }
        if (UniffiLib.uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_get_room_settings() != ((short) 44776)) {
            throw new RuntimeException("UniFFI API checksum mismatch: try cleaning and rebuilding your project");
        }
        if (UniffiLib.uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_get_user_devices() != ((short) 29379)) {
            throw new RuntimeException("UniFFI API checksum mismatch: try cleaning and rebuilding your project");
        }
        if (UniffiLib.uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_get_verification() != ((short) 27507)) {
            throw new RuntimeException("UniFFI API checksum mismatch: try cleaning and rebuilding your project");
        }
        if (UniffiLib.uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_get_verification_request() != ((short) 13456)) {
            throw new RuntimeException("UniFFI API checksum mismatch: try cleaning and rebuilding your project");
        }
        if (UniffiLib.uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_get_verification_requests() != ((short) 25809)) {
            throw new RuntimeException("UniFFI API checksum mismatch: try cleaning and rebuilding your project");
        }
        if (UniffiLib.uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_identity_keys() != ((short) 53117)) {
            throw new RuntimeException("UniFFI API checksum mismatch: try cleaning and rebuilding your project");
        }
        if (UniffiLib.uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_import_cross_signing_keys() != ((short) 12308)) {
            throw new RuntimeException("UniFFI API checksum mismatch: try cleaning and rebuilding your project");
        }
        if (UniffiLib.uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_import_decrypted_room_keys() != ((short) 46590)) {
            throw new RuntimeException("UniFFI API checksum mismatch: try cleaning and rebuilding your project");
        }
        if (UniffiLib.uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_import_room_keys() != ((short) 62785)) {
            throw new RuntimeException("UniFFI API checksum mismatch: try cleaning and rebuilding your project");
        }
        if (UniffiLib.uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_import_room_keys_from_backup() != ((short) 12393)) {
            throw new RuntimeException("UniFFI API checksum mismatch: try cleaning and rebuilding your project");
        }
        if (UniffiLib.uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_is_identity_verified() != ((short) 29225)) {
            throw new RuntimeException("UniFFI API checksum mismatch: try cleaning and rebuilding your project");
        }
        if (UniffiLib.uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_is_user_tracked() != ((short) 19109)) {
            throw new RuntimeException("UniFFI API checksum mismatch: try cleaning and rebuilding your project");
        }
        if (UniffiLib.uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_mark_request_as_sent() != ((short) 62956)) {
            throw new RuntimeException("UniFFI API checksum mismatch: try cleaning and rebuilding your project");
        }
        if (UniffiLib.uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_outgoing_requests() != ((short) 57999)) {
            throw new RuntimeException("UniFFI API checksum mismatch: try cleaning and rebuilding your project");
        }
        if (UniffiLib.uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_query_missing_secrets_from_other_sessions() != ((short) 25133)) {
            throw new RuntimeException("UniFFI API checksum mismatch: try cleaning and rebuilding your project");
        }
        if (UniffiLib.uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_receive_sync_changes() != ((short) 36611)) {
            throw new RuntimeException("UniFFI API checksum mismatch: try cleaning and rebuilding your project");
        }
        if (UniffiLib.uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_receive_unencrypted_verification_event() != ((short) 814)) {
            throw new RuntimeException("UniFFI API checksum mismatch: try cleaning and rebuilding your project");
        }
        if (UniffiLib.uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_receive_verification_event() != ((short) 25842)) {
            throw new RuntimeException("UniFFI API checksum mismatch: try cleaning and rebuilding your project");
        }
        if (UniffiLib.uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_request_room_key() != ((short) 62030)) {
            throw new RuntimeException("UniFFI API checksum mismatch: try cleaning and rebuilding your project");
        }
        if (UniffiLib.uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_request_self_verification() != ((short) 16780)) {
            throw new RuntimeException("UniFFI API checksum mismatch: try cleaning and rebuilding your project");
        }
        if (UniffiLib.uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_request_verification() != ((short) 10863)) {
            throw new RuntimeException("UniFFI API checksum mismatch: try cleaning and rebuilding your project");
        }
        if (UniffiLib.uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_request_verification_with_device() != ((short) 47220)) {
            throw new RuntimeException("UniFFI API checksum mismatch: try cleaning and rebuilding your project");
        }
        if (UniffiLib.uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_room_key_counts() != ((short) 11158)) {
            throw new RuntimeException("UniFFI API checksum mismatch: try cleaning and rebuilding your project");
        }
        if (UniffiLib.uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_save_recovery_key() != ((short) 29749)) {
            throw new RuntimeException("UniFFI API checksum mismatch: try cleaning and rebuilding your project");
        }
        if (UniffiLib.uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_set_local_trust() != ((short) 1513)) {
            throw new RuntimeException("UniFFI API checksum mismatch: try cleaning and rebuilding your project");
        }
        if (UniffiLib.uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_set_only_allow_trusted_devices() != ((short) 6312)) {
            throw new RuntimeException("UniFFI API checksum mismatch: try cleaning and rebuilding your project");
        }
        if (UniffiLib.uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_set_room_algorithm() != ((short) 53648)) {
            throw new RuntimeException("UniFFI API checksum mismatch: try cleaning and rebuilding your project");
        }
        if (UniffiLib.uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_set_room_only_allow_trusted_devices() != ((short) 45665)) {
            throw new RuntimeException("UniFFI API checksum mismatch: try cleaning and rebuilding your project");
        }
        if (UniffiLib.uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_share_room_key() != ((short) 24123)) {
            throw new RuntimeException("UniFFI API checksum mismatch: try cleaning and rebuilding your project");
        }
        if (UniffiLib.uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_sign() != ((short) 29599)) {
            throw new RuntimeException("UniFFI API checksum mismatch: try cleaning and rebuilding your project");
        }
        if (UniffiLib.uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_start_sas_with_device() != ((short) 9074)) {
            throw new RuntimeException("UniFFI API checksum mismatch: try cleaning and rebuilding your project");
        }
        if (UniffiLib.uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_update_tracked_users() != ((short) 40609)) {
            throw new RuntimeException("UniFFI API checksum mismatch: try cleaning and rebuilding your project");
        }
        if (UniffiLib.uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_user_id() != ((short) 55977)) {
            throw new RuntimeException("UniFFI API checksum mismatch: try cleaning and rebuilding your project");
        }
        if (UniffiLib.uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_verification_request_content() != ((short) 36804)) {
            throw new RuntimeException("UniFFI API checksum mismatch: try cleaning and rebuilding your project");
        }
        if (UniffiLib.uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_verify_backup() != ((short) 6056)) {
            throw new RuntimeException("UniFFI API checksum mismatch: try cleaning and rebuilding your project");
        }
        if (UniffiLib.uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_verify_device() != ((short) 4142)) {
            throw new RuntimeException("UniFFI API checksum mismatch: try cleaning and rebuilding your project");
        }
        if (UniffiLib.uniffi_matrix_sdk_crypto_ffi_checksum_method_olmmachine_verify_identity() != ((short) 57727)) {
            throw new RuntimeException("UniFFI API checksum mismatch: try cleaning and rebuilding your project");
        }
        if (UniffiLib.uniffi_matrix_sdk_crypto_ffi_checksum_method_qrcode_cancel() != ((short) 3198)) {
            throw new RuntimeException("UniFFI API checksum mismatch: try cleaning and rebuilding your project");
        }
        if (UniffiLib.uniffi_matrix_sdk_crypto_ffi_checksum_method_qrcode_cancel_info() != ((short) 36601)) {
            throw new RuntimeException("UniFFI API checksum mismatch: try cleaning and rebuilding your project");
        }
        if (UniffiLib.uniffi_matrix_sdk_crypto_ffi_checksum_method_qrcode_confirm() != ((short) 21545)) {
            throw new RuntimeException("UniFFI API checksum mismatch: try cleaning and rebuilding your project");
        }
        if (UniffiLib.uniffi_matrix_sdk_crypto_ffi_checksum_method_qrcode_flow_id() != ((short) 48960)) {
            throw new RuntimeException("UniFFI API checksum mismatch: try cleaning and rebuilding your project");
        }
        if (UniffiLib.uniffi_matrix_sdk_crypto_ffi_checksum_method_qrcode_generate_qr_code() != ((short) 40958)) {
            throw new RuntimeException("UniFFI API checksum mismatch: try cleaning and rebuilding your project");
        }
        if (UniffiLib.uniffi_matrix_sdk_crypto_ffi_checksum_method_qrcode_has_been_scanned() != ((short) 60281)) {
            throw new RuntimeException("UniFFI API checksum mismatch: try cleaning and rebuilding your project");
        }
        if (UniffiLib.uniffi_matrix_sdk_crypto_ffi_checksum_method_qrcode_is_cancelled() != ((short) 29683)) {
            throw new RuntimeException("UniFFI API checksum mismatch: try cleaning and rebuilding your project");
        }
        if (UniffiLib.uniffi_matrix_sdk_crypto_ffi_checksum_method_qrcode_is_done() != ((short) 37776)) {
            throw new RuntimeException("UniFFI API checksum mismatch: try cleaning and rebuilding your project");
        }
        if (UniffiLib.uniffi_matrix_sdk_crypto_ffi_checksum_method_qrcode_other_device_id() != ((short) 40756)) {
            throw new RuntimeException("UniFFI API checksum mismatch: try cleaning and rebuilding your project");
        }
        if (UniffiLib.uniffi_matrix_sdk_crypto_ffi_checksum_method_qrcode_other_user_id() != ((short) 8703)) {
            throw new RuntimeException("UniFFI API checksum mismatch: try cleaning and rebuilding your project");
        }
        if (UniffiLib.uniffi_matrix_sdk_crypto_ffi_checksum_method_qrcode_reciprocated() != ((short) 23814)) {
            throw new RuntimeException("UniFFI API checksum mismatch: try cleaning and rebuilding your project");
        }
        if (UniffiLib.uniffi_matrix_sdk_crypto_ffi_checksum_method_qrcode_room_id() != ((short) 32113)) {
            throw new RuntimeException("UniFFI API checksum mismatch: try cleaning and rebuilding your project");
        }
        if (UniffiLib.uniffi_matrix_sdk_crypto_ffi_checksum_method_qrcode_set_changes_listener() != ((short) 16104)) {
            throw new RuntimeException("UniFFI API checksum mismatch: try cleaning and rebuilding your project");
        }
        if (UniffiLib.uniffi_matrix_sdk_crypto_ffi_checksum_method_qrcode_state() != ((short) 23228)) {
            throw new RuntimeException("UniFFI API checksum mismatch: try cleaning and rebuilding your project");
        }
        if (UniffiLib.uniffi_matrix_sdk_crypto_ffi_checksum_method_qrcode_we_started() != ((short) 35852)) {
            throw new RuntimeException("UniFFI API checksum mismatch: try cleaning and rebuilding your project");
        }
        if (UniffiLib.uniffi_matrix_sdk_crypto_ffi_checksum_method_sas_accept() != ((short) 64101)) {
            throw new RuntimeException("UniFFI API checksum mismatch: try cleaning and rebuilding your project");
        }
        if (UniffiLib.uniffi_matrix_sdk_crypto_ffi_checksum_method_sas_cancel() != ((short) 54583)) {
            throw new RuntimeException("UniFFI API checksum mismatch: try cleaning and rebuilding your project");
        }
        if (UniffiLib.uniffi_matrix_sdk_crypto_ffi_checksum_method_sas_confirm() != ((short) 19944)) {
            throw new RuntimeException("UniFFI API checksum mismatch: try cleaning and rebuilding your project");
        }
        if (UniffiLib.uniffi_matrix_sdk_crypto_ffi_checksum_method_sas_flow_id() != ((short) 5064)) {
            throw new RuntimeException("UniFFI API checksum mismatch: try cleaning and rebuilding your project");
        }
        if (UniffiLib.uniffi_matrix_sdk_crypto_ffi_checksum_method_sas_get_decimals() != ((short) 49556)) {
            throw new RuntimeException("UniFFI API checksum mismatch: try cleaning and rebuilding your project");
        }
        if (UniffiLib.uniffi_matrix_sdk_crypto_ffi_checksum_method_sas_get_emoji_indices() != ((short) 40253)) {
            throw new RuntimeException("UniFFI API checksum mismatch: try cleaning and rebuilding your project");
        }
        if (UniffiLib.uniffi_matrix_sdk_crypto_ffi_checksum_method_sas_is_done() != ((short) 9507)) {
            throw new RuntimeException("UniFFI API checksum mismatch: try cleaning and rebuilding your project");
        }
        if (UniffiLib.uniffi_matrix_sdk_crypto_ffi_checksum_method_sas_other_device_id() != ((short) 32008)) {
            throw new RuntimeException("UniFFI API checksum mismatch: try cleaning and rebuilding your project");
        }
        if (UniffiLib.uniffi_matrix_sdk_crypto_ffi_checksum_method_sas_other_user_id() != ((short) 45589)) {
            throw new RuntimeException("UniFFI API checksum mismatch: try cleaning and rebuilding your project");
        }
        if (UniffiLib.uniffi_matrix_sdk_crypto_ffi_checksum_method_sas_room_id() != ((short) 31198)) {
            throw new RuntimeException("UniFFI API checksum mismatch: try cleaning and rebuilding your project");
        }
        if (UniffiLib.uniffi_matrix_sdk_crypto_ffi_checksum_method_sas_set_changes_listener() != ((short) 26638)) {
            throw new RuntimeException("UniFFI API checksum mismatch: try cleaning and rebuilding your project");
        }
        if (UniffiLib.uniffi_matrix_sdk_crypto_ffi_checksum_method_sas_state() != ((short) 20796)) {
            throw new RuntimeException("UniFFI API checksum mismatch: try cleaning and rebuilding your project");
        }
        if (UniffiLib.uniffi_matrix_sdk_crypto_ffi_checksum_method_sas_we_started() != ((short) 15866)) {
            throw new RuntimeException("UniFFI API checksum mismatch: try cleaning and rebuilding your project");
        }
        if (UniffiLib.uniffi_matrix_sdk_crypto_ffi_checksum_method_verification_as_qr() != ((short) 42648)) {
            throw new RuntimeException("UniFFI API checksum mismatch: try cleaning and rebuilding your project");
        }
        if (UniffiLib.uniffi_matrix_sdk_crypto_ffi_checksum_method_verification_as_sas() != ((short) 26164)) {
            throw new RuntimeException("UniFFI API checksum mismatch: try cleaning and rebuilding your project");
        }
        if (UniffiLib.uniffi_matrix_sdk_crypto_ffi_checksum_method_verificationrequest_accept() != ((short) 37091)) {
            throw new RuntimeException("UniFFI API checksum mismatch: try cleaning and rebuilding your project");
        }
        if (UniffiLib.uniffi_matrix_sdk_crypto_ffi_checksum_method_verificationrequest_cancel() != ((short) 43237)) {
            throw new RuntimeException("UniFFI API checksum mismatch: try cleaning and rebuilding your project");
        }
        if (UniffiLib.uniffi_matrix_sdk_crypto_ffi_checksum_method_verificationrequest_cancel_info() != ((short) 45974)) {
            throw new RuntimeException("UniFFI API checksum mismatch: try cleaning and rebuilding your project");
        }
        if (UniffiLib.uniffi_matrix_sdk_crypto_ffi_checksum_method_verificationrequest_flow_id() != ((short) 58414)) {
            throw new RuntimeException("UniFFI API checksum mismatch: try cleaning and rebuilding your project");
        }
        if (UniffiLib.uniffi_matrix_sdk_crypto_ffi_checksum_method_verificationrequest_is_cancelled() != ((short) 41041)) {
            throw new RuntimeException("UniFFI API checksum mismatch: try cleaning and rebuilding your project");
        }
        if (UniffiLib.uniffi_matrix_sdk_crypto_ffi_checksum_method_verificationrequest_is_done() != ((short) 18504)) {
            throw new RuntimeException("UniFFI API checksum mismatch: try cleaning and rebuilding your project");
        }
        if (UniffiLib.uniffi_matrix_sdk_crypto_ffi_checksum_method_verificationrequest_is_passive() != ((short) 18208)) {
            throw new RuntimeException("UniFFI API checksum mismatch: try cleaning and rebuilding your project");
        }
        if (UniffiLib.uniffi_matrix_sdk_crypto_ffi_checksum_method_verificationrequest_is_ready() != ((short) 17719)) {
            throw new RuntimeException("UniFFI API checksum mismatch: try cleaning and rebuilding your project");
        }
        if (UniffiLib.uniffi_matrix_sdk_crypto_ffi_checksum_method_verificationrequest_other_device_id() != ((short) 40930)) {
            throw new RuntimeException("UniFFI API checksum mismatch: try cleaning and rebuilding your project");
        }
        if (UniffiLib.uniffi_matrix_sdk_crypto_ffi_checksum_method_verificationrequest_other_user_id() != ((short) 37236)) {
            throw new RuntimeException("UniFFI API checksum mismatch: try cleaning and rebuilding your project");
        }
        if (UniffiLib.uniffi_matrix_sdk_crypto_ffi_checksum_method_verificationrequest_our_supported_methods() != ((short) 13926)) {
            throw new RuntimeException("UniFFI API checksum mismatch: try cleaning and rebuilding your project");
        }
        if (UniffiLib.uniffi_matrix_sdk_crypto_ffi_checksum_method_verificationrequest_room_id() != ((short) 15167)) {
            throw new RuntimeException("UniFFI API checksum mismatch: try cleaning and rebuilding your project");
        }
        if (UniffiLib.uniffi_matrix_sdk_crypto_ffi_checksum_method_verificationrequest_scan_qr_code() != ((short) 31028)) {
            throw new RuntimeException("UniFFI API checksum mismatch: try cleaning and rebuilding your project");
        }
        if (UniffiLib.uniffi_matrix_sdk_crypto_ffi_checksum_method_verificationrequest_set_changes_listener() != ((short) 37006)) {
            throw new RuntimeException("UniFFI API checksum mismatch: try cleaning and rebuilding your project");
        }
        if (UniffiLib.uniffi_matrix_sdk_crypto_ffi_checksum_method_verificationrequest_start_qr_verification() != ((short) 64927)) {
            throw new RuntimeException("UniFFI API checksum mismatch: try cleaning and rebuilding your project");
        }
        if (UniffiLib.uniffi_matrix_sdk_crypto_ffi_checksum_method_verificationrequest_start_sas_verification() != ((short) 17697)) {
            throw new RuntimeException("UniFFI API checksum mismatch: try cleaning and rebuilding your project");
        }
        if (UniffiLib.uniffi_matrix_sdk_crypto_ffi_checksum_method_verificationrequest_state() != ((short) 30830)) {
            throw new RuntimeException("UniFFI API checksum mismatch: try cleaning and rebuilding your project");
        }
        if (UniffiLib.uniffi_matrix_sdk_crypto_ffi_checksum_method_verificationrequest_their_supported_methods() != ((short) 1021)) {
            throw new RuntimeException("UniFFI API checksum mismatch: try cleaning and rebuilding your project");
        }
        if (UniffiLib.uniffi_matrix_sdk_crypto_ffi_checksum_method_verificationrequest_we_started() != ((short) 49837)) {
            throw new RuntimeException("UniFFI API checksum mismatch: try cleaning and rebuilding your project");
        }
        if (UniffiLib.uniffi_matrix_sdk_crypto_ffi_checksum_constructor_pkencryption_from_base64() != ((short) 43917)) {
            throw new RuntimeException("UniFFI API checksum mismatch: try cleaning and rebuilding your project");
        }
        if (UniffiLib.uniffi_matrix_sdk_crypto_ffi_checksum_constructor_backuprecoverykey_from_base58() != ((short) 17539)) {
            throw new RuntimeException("UniFFI API checksum mismatch: try cleaning and rebuilding your project");
        }
        if (UniffiLib.uniffi_matrix_sdk_crypto_ffi_checksum_constructor_backuprecoverykey_from_base64() != ((short) 21147)) {
            throw new RuntimeException("UniFFI API checksum mismatch: try cleaning and rebuilding your project");
        }
        if (UniffiLib.uniffi_matrix_sdk_crypto_ffi_checksum_constructor_backuprecoverykey_from_passphrase() != ((short) 2829)) {
            throw new RuntimeException("UniFFI API checksum mismatch: try cleaning and rebuilding your project");
        }
        if (UniffiLib.uniffi_matrix_sdk_crypto_ffi_checksum_constructor_backuprecoverykey_new() != ((short) 379)) {
            throw new RuntimeException("UniFFI API checksum mismatch: try cleaning and rebuilding your project");
        }
        if (UniffiLib.uniffi_matrix_sdk_crypto_ffi_checksum_constructor_backuprecoverykey_new_from_passphrase() != ((short) 13280)) {
            throw new RuntimeException("UniFFI API checksum mismatch: try cleaning and rebuilding your project");
        }
        if (UniffiLib.uniffi_matrix_sdk_crypto_ffi_checksum_constructor_olmmachine_new() != ((short) 27488)) {
            throw new RuntimeException("UniFFI API checksum mismatch: try cleaning and rebuilding your project");
        }
        if (UniffiLib.uniffi_matrix_sdk_crypto_ffi_checksum_method_progresslistener_on_progress() != ((short) 42531)) {
            throw new RuntimeException("UniFFI API checksum mismatch: try cleaning and rebuilding your project");
        }
        if (UniffiLib.uniffi_matrix_sdk_crypto_ffi_checksum_method_logger_log() != ((short) 13905)) {
            throw new RuntimeException("UniFFI API checksum mismatch: try cleaning and rebuilding your project");
        }
        if (UniffiLib.uniffi_matrix_sdk_crypto_ffi_checksum_method_qrcodelistener_on_change() != ((short) 55535)) {
            throw new RuntimeException("UniFFI API checksum mismatch: try cleaning and rebuilding your project");
        }
        if (UniffiLib.uniffi_matrix_sdk_crypto_ffi_checksum_method_saslistener_on_change() != ((short) 12830)) {
            throw new RuntimeException("UniFFI API checksum mismatch: try cleaning and rebuilding your project");
        }
        if (UniffiLib.uniffi_matrix_sdk_crypto_ffi_checksum_method_verificationrequestlistener_on_change() != ((short) 56287)) {
            throw new RuntimeException("UniFFI API checksum mismatch: try cleaning and rebuilding your project");
        }
    }
}

// Define FFI callback types
